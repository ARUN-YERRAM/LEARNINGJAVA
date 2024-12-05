/*
You are entering into a maze N*N grid consist of(0's and 1's)
Initially you will start from (0,0) position in the maze, 
Your target is to reach the end position (N-1, N-1).

Among the four directions available(top, down, left, right),
you can move in two directions only, right and down.

In the maze, '0' indicates dead end and '1' indicates open way. 
You can travel through only open way.

For Example:-
Given Maze of size N=4 , starting position is (0, 0),
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

You can reach the (3, 3) position in the following way.
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1

Return true, if you can reach the end position(N-1, N-1).
otherwise return false.

Input Format:
-------------
Line-1 -> An integer N, size of square board.
Next N lines -> N space separated integers 

Output Format:
--------------
Print a boolean value.

Sample Input-1:
---------------
4
1 0 0 0
1 1 0 1
0 1 0 0
1 1 1 1

Sample Output-1:
----------------
true


Sample Input-2:
---------------
4
1 1 0 0
1 0 0 1
0 1 1 0
1 0 0 1

Sample Output-2:
----------------
false
*/

import java.util.Scanner;

public class Maze {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[][] maze = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        
        if (canReachEnd(maze, N)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
    public static boolean canReachEnd(int[][] maze, int N) {
        
        boolean[][] visited = new boolean[N][N];
        
        return dfs(maze, 0, 0, N, visited);
    }
in 
/*************  ✨ Codeium Command ⭐  *************/
/******  a66f4331-a853-443b-bc01-f488c3527b5d  *******/
    public static boolean dfs(int[][] maze, int i, int j, int N, boolean[][] visited) {
        
        if (i < 0 || i >= N || j < 0 || j >= N || maze[i][j] == 0 || visited[i][j]) {
            return false;
        }
        
        if (i == N - 1 && j == N - 1) {
            return true;
        }
        
        visited[i][j] = true;
        
        if (dfs(maze, i, j + 1, N, visited) || dfs(maze, i + 1, j, N, visited)) {
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
}