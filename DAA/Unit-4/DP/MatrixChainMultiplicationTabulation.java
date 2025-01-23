
/*
MatrixMultiplication_DP
Your are given the sizes of N-1 matrices as a list[] of size N, 
where the matrix are numbered from 0 to N-2 
and the matrix size is defined as matrix-i size is list[i]*list[i+1].

Matrix multiplication follows associative rule. If you want to multiply 4 matrices,
A,B,C and D.
You can perform multiplication in the following ways, ABCD, AB(CD), A(BC)D, 
((AB)C)D, (AB)(CD)..etc.
To multiply two matrices of size m*n, n*p, you require m*n*p number of multiplications.

Your task is to return the minimum number of multiplications needed to multiply 
the N-1 matrices.

Input Format:
------------------
Line-1: An integer N
Line-2: N space separated integers, the list[]

Output Format:
--------------------
Print an integer, minimum multiplications needed.


Sample Input-1:
--------------------
4
10 30 5 60

Sample Output-1:
----------------------
4500

Explanation:
-----------------
posibilities are:
(AB)C => (10×30×5) + (10×5×60) => 1500 + 3000 = 4500 multiplications
A(BC) => (30×5×60) + (10×30×60) => 9000 + 18000 = 27000 multiplications


Sample Input-2:
--------------------
5
12 5 18 7 19

Sample Output-2:
----------------------
2435

Explanation:
-----------------
The best way is: A((BC)D) => (12*5*19) + (5*18*7) + (5*7*19)
=> 1140 + 630 + 665 = 2435 multiplications
*/


import java.util.*;

public class MatrixChainMultiplicationTabulation{

    // Function to compute the minimum cost of matrix multiplication using tabulation
    public static int matrixChainTabulation(int[] dims) {
        int n = dims.length;
        int[][] dp = new int[n][n];

        // dp[i][j] represents the minimum cost to multiply matrices from i to j

        // Fill the dp array
        for (int len = 2; len < n; len++) { // len is the length of the matrix chain
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                // Try all possible splits between i and j
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dims[i - 1] * dims[k] * dims[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(matrixChainTabulation(arr));
    }
}
