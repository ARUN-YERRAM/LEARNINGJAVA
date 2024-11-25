/*
Viraj Aanand is a wedding planner, He order his assistant to decorate a wall.
The decorator plans to decorate the wall with two different colored balloons.
The wall size is M*N, The decorator can decorate the wall using M*N balloons
the balloons are blue or white in color.

Blue colored ballons represented with digit-1 and 
White colored ballons represented with digit-0.

The blue colored balloons forms different shapes, that are connected 4 directonally.
The directons are upwards, downwards, left, and right. Viraj Aanand got an idea to 
count the unique shapes formed by blue colored ballons.

You will be given the decorated wall as a matrix wall[][].
Your task is to help, Viraj Aanand to count the unique shapes.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the wall.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer, Number of distinct shapes formed by blue balloons.


Sample Input-1:
---------------
4 5
1 1 0 0 0
1 1 0 0 0
0 0 0 1 1
0 0 0 1 1

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5 5
1 1 0 1 1
1 0 0 0 1
0 0 0 0 0
1 0 0 0 1
1 1 0 1 1

Sample Output-2:
----------------
4

Note: 
-------
The shapes, 
1 1  		  1 1
1     and    1 
are different.
*/

import java.util.*;

public class DistinctIslands_BFS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the wall
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Read the wall matrix
        int[][] wall = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                wall[i][j] = scanner.nextInt();
            }
        }

        // Find and count unique shapes
        int uniqueShapes = countUniqueShapes(wall);
        System.out.println(uniqueShapes);

        scanner.close();
    }

    public static int countUniqueShapes(int[][] wall) {
        int M = wall.length;
        int N = wall[0].length;
        boolean[][] visited = new boolean[M][N];
        Set<String> uniqueShapes = new HashSet<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (wall[i][j] == 1 && !visited[i][j]) {
                    List<int[]> shape = new ArrayList<>();
                    dfs(wall, visited, i, j, i, j, shape);
                    uniqueShapes.add(normalizeShape(shape));
                }
            }
        }

        return uniqueShapes.size();
    }

    private static void dfs(int[][] wall, boolean[][] visited, int baseX, int baseY, int x, int y, List<int[]> shape) {
        int M = wall.length;
        int N = wall[0].length;

        if (x < 0 || x >= M || y < 0 || y >= N || wall[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        shape.add(new int[]{x - baseX, y - baseY});

        // Explore all 4 possible directions
        dfs(wall, visited, baseX, baseY, x - 1, y, shape); // Up
        dfs(wall, visited, baseX, baseY, x + 1, y, shape); // Down
        dfs(wall, visited, baseX, baseY, x, y - 1, shape); // Left
        dfs(wall, visited, baseX, baseY, x, y + 1, shape); // Right
    }

    private static String normalizeShape(List<int[]> shape) {
        Collections.sort(shape, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        StringBuilder sb = new StringBuilder();
        for (int[] coord : shape) {
            sb.append(coord[0]).append(",").append(coord[1]).append(";");
        }
        return sb.toString();
    }
}