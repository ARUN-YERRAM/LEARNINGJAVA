import java.util.*;

class LRS {

    public int search(int L, int a, long modulus, int n, int[] nums) {
        // Compute the hash of string S[:L]
        long h = 0;
        for (int i = 0; i < L; ++i) h = (h * a + nums[i]) % modulus;

        // Already seen hashes of strings of length L
        HashSet<Long> seen = new HashSet<>();
        seen.add(h);

        // Const value to be used often: a**L % modulus
        long aL = 1;
        for (int i = 1; i <= L; ++i) aL = (aL * a) % modulus;

        for (int start = 1; start < n - L + 1; ++start) {
            // Compute rolling hash in O(1) time
            h = (h * a - nums[start - 1] * aL % modulus + modulus) % modulus;
            h = (h + nums[start + L - 1]) % modulus;
            if (seen.contains(h)) return start;
            seen.add(h);
        }
        return -1;
    }

    public int longestRepeatingSubstring(String S) {
        int n = S.length();
        // Convert string to array of integers
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) nums[i] = (int) S.charAt(i) - (int) 'a';

        // Base value for the rolling hash function
        int a = 26;
        // Modulus value for the rolling hash function to avoid overflow
        long modulus = (long) Math.pow(2, 24);

        // Binary search, L = repeating string length
        int left = 1, right = n;
        while (left <= right) {
            int L = left + (right - left) / 2;
            if (search(L, a, modulus, n, nums) != -1) left = L + 1;
            else right = L - 1;
        }

        return left - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String S = sc.next();
        LRS obj = new LRS();
        System.out.println("Length of Longest Repeating Substring: " + obj.longestRepeatingSubstring(S));
    }
}
