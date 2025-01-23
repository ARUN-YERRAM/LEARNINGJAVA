/*
Jadav Payeng, "The Forest Man of India", 
started planting the seeds in a M*N grid land.
Each cell in the grid land is planted with a seed.
After few days, some seeds grow into saplings indicates with '1',
and the rest are dead seeds indicates with '0'.

One or more saplings are connected either horizontally, vertically or diagonally
with each other, form a sapling-group. 
There may be zero more sapling-groups in the grid land.

Jadav Payeng wants to know the biggest sapling-group in that grid land.

You are given the M * N grid, filled with 0's and 1's.
You are task is to help Jadav Payeng to find the number of saplings in 
the largest sapling-group.

Input Format:
-------------
Line-1: Two integers M and N, the number of rows and columns in the grid-land.
Next M lines: contains N space-separated integers .

Output Format:
--------------
Print an integer, the number of saplings in the 
largest sapling-group in the given grid-land.

Sample Input-1:
---------------
5 4
0 0 1 1
0 0 1 0
0 1 1 0
0 1 0 0
1 1 0 0

Sample Output-1:
----------------
8


Sample Input-2:
---------------
5 5
0 1 1 1 1
0 0 0 0 1
1 1 0 0 0
1 1 0 1 1
0 0 0 1 0

Sample Output-2:
----------------
5
*/

import java.util.*;

public class MaxArea_BFS {

    static int mx = Integer.MIN_VALUE;


    public static void bfs(int[][] grid, int[][] vis, int i, int j, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        vis[i][j] = 1;

    
        int[][] dir = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        int cnt = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int l = cur[0], r = cur[1];
            cnt++;
            
            for (int[] d : dir) {
                int ni = l + d[0];
                int nj = r + d[1];

                if (ni >= 0 && nj >= 0 && ni < m && nj < n && vis[ni][nj] == 0 && grid[ni][nj] == 1) {
                    q.offer(new int[]{ni, nj});
                    vis[ni][nj] = 1; 
                }
            }
        }

        mx = Math.max(mx, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] vis = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                vis[i][j] = 0;
            }
        }

     
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    bfs(grid, vis, i, j, r, c);
                }
            }
        }

        System.out.println(mx);
    }
}