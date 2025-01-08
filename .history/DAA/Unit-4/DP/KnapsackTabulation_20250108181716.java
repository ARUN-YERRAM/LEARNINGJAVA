public class KnapsackTabulation {

    // Function to solve 0/1 Knapsack using Tabulation
    public static int knapsackTabulation(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] values = {10, 12, 14, 16};
        int[] weights = {9, 8, 12, 14};
        int capacity = 25;

        System.out.println("Maximum value: " + knapsackTabulation(values, weights, capacity));
    }
}
