public class LRSubstringDP {
    public static String longestRepeatingSubstring(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        int maxLen = 0;
        int endIndex = -1;

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) { // Ensure j > i to avoid self-comparison
                if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    // Update maxLen and endIndex
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        // If no repeating substring is found
        if (maxLen == 0) {
            return "";
        }

        // Extract the longest repeating substring
        return s.substring(endIndex - maxLen, endIndex);
    }

    public static void main(String[] args) {
        String s = "banana";
        String result = longestRepeatingSubstring(s);
        System.out.println("Longest Repeating Substring: " + result);
    }
}
