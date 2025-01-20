import java.util.*;

class MaxSubArray {
    public int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n]; // dp[i] means the maximum subarray ending with A[i]
        dp[0] = A[0];
        int max = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Maximum Subarray Sum: " + new MaxSubArray().maxSubArray(ar));
        sc.close();
    }
}
