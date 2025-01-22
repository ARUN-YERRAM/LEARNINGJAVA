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
                    bfs(wall, visited, i, j, shape);
                    uniqueShapes.add(normalizeShape(shape));
                }
            }
        }
        return uniqueShapes.size();
    }

    private static void bfs(int[][] wall, boolean[][] visited, int baseX, int baseY, List<int[]> shape) {
        int M = wall.length;
        int N = wall[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{baseX, baseY});
        visited[baseX][baseY] = true;

        // Define directions for BFS (up, down, left, right)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // Store relative coordinates
            shape.add(new int[]{x - baseX, y - baseY});

            // Explore neighbors
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < M && newY >= 0 && newY < N 
                        && wall[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
    }

    private static String normalizeShape(List<int[]> shape) {
        // Sort the shape coordinates to normalize
        Collections.sort(shape, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        StringBuilder sb = new StringBuilder();
        for (int[] coord : shape) {
            sb.append(coord[0]).append(",").append(coord[1]).append(";");
        }
        return sb.toString();
    }
}
