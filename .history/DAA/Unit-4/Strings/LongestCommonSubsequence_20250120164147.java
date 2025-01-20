/*
Given two strings text1 and text2 , return the length of their longest common 
subsequence.
A subsequence of a string is a new string generated from the original string 
with some characters(can be none) deleted without changing the relative order of 
the remaining characters. 
(eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence 
of two strings is a subsequence that is common to both strings.

If there is no common subsequence, return 0.

Example 1:
Input: text1 = "abcde", text2 = "ace" 
Output: 3 
Explanation: The longest common subsequence is "ace" and its length is 3.

Example 2:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.


Example 3:
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.



case=1
input=
abcde
ace
output=
3
case=2
input=
abc
abc
output=
3
case=3
input=
abc
def
output=
0



*/

import java.util.*;

public class LongestCommonSubsequence {

    static int recurseMem(String s1, String s2, int n, int m, int[][] dp) {
        // Base case: If either string is exhausted
        if (n == 0 || m == 0) {
            return 0;
        }

        // Check if the result is already computed
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        // If characters match, increment the count
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            dp[n][m] = 1 + recurseMem(s1, s2, n - 1, m - 1, dp);
        } 
        // If characters don't match, take the maximum result by skipping a character
        else {
            dp[n][m] = Math.max(recurseMem(s1, s2, n - 1, m, dp), recurseMem(s1, s2, n, m - 1, dp));
        }

        return dp[n][m];
    }
    
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        // Create a 2D DP array to store the lengths of LCS
        int[][] dp = new int[m + 1][n + 1];
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters match, the LCS length increases by 1
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, take the maximum of excluding either character
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // The value at dp[m][n] will be the length of the LCS
        return dp[m][n];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";

        Scanner sc = new Scanner(System.in);
        // String s1 = sc.next();
        // String s2 = sc.next();

        int n = text1.length();
        int m = text2.length();

        // Initialize dp array with -1 (uncomputed state)
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Call the function and print the result
        int result = recurseMem(text1, text2, n, m, dp);
        System.out.println("The length of the Longest Common Subsequence is: " + result);
        
        System.out.println("Length of Longest Common Subsequence: " + longestCommonSubsequence(text1, text2));
    }
}
