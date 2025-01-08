public class MaximumSubarraySumDP {

    // Function to find the maximum subarray sum using Dynamic Programming
    public static int maxSubArraySum(int[] nums) {
        int n = nums.length;

        // dp[i] represents the maximum sum of subarray ending at index i
        int[] dp = new int[n];

        // Base case: The first element is the maximum sum for subarray ending at index 0
        dp[0] = nums[0];
        int maxSoFar = dp[0];

        // Fill the dp array
        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start a new subarray
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            // Update the global maximum
            maxSoFar = Math.max(maxSoFar, dp[i]);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
    }
}
