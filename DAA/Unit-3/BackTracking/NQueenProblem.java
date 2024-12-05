/*
N_Queens
Akbar used to play chess with Birbal almost every evening.
Once Akbar has challanged Birbal to place the queens in each row of the board,
such that no queen should attack another queen on the board.

You are given an integer N, indicates the size of the board as N*N.
Your task is to help Birbal to find and win in this challange, 
if there is a solution, print the answer as shown in the samples
Otherwise, print "No Solution"

Input Format:
-------------
An integer N, size of the chess board.

Output Format:
--------------
Print any possible solution.


Sample Input-1:
---------------
4

Sample Output-1:
----------------
0010
1000
0001
0100

Sample Input-2:
---------------
3

Sample Output-2:
----------------
No Solution
*/

import java.util.*;

public class NQueenProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if (n <= 0) {
            System.out.println("No Solution");
            return;
        }
        
        int[][] board = new int[n][n];
        if (solveNQueens(board, 0, n)) {
            printBoard(board, n);
        } else {
            System.out.println("No Solution");
        }
    }

    // Function to solve the N-Queens problem using backtracking
    private static boolean solveNQueens(int[][] board, int row, int n) {
        if (row >= n) {
            return true; // All queens are placed
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1; // Place the queen
                if (solveNQueens(board, row + 1, n)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid placement found for this row
    }

    // Function to check if it's safe to place a queen at board[row][col]
    private static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Function to print the board
    private static void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
