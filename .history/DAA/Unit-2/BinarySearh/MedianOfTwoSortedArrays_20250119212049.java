public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;
        int left = 0, right = n1;
        int total = n1 + n2;

        while (left <= right) {
            int m1 = (left + right) / 2; // Partition nums1
            int m2 = (total + 1) / 2 - m1; // Partition nums2

            // Get the partition elements
            int l1 = (m1 == 0) ? Integer.MIN_VALUE : nums1[m1 - 1];
            int r1 = (m1 == n1) ? Integer.MAX_VALUE : nums1[m1];

            int l2 = (m2 == 0) ? Integer.MIN_VALUE : nums2[m2 - 1];
            int r2 = (m2 == n2) ? Integer.MAX_VALUE : nums2[m2];

            // Check for valid partition
            if (l1 <= r2 && l2 <= r1) {
                // Odd length
                if (total % 2 == 1) {
                    return Math.max(l1, l2);
                } else {
                    // Even length
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            } else if (l1 > r2) {
                right = m1 - 1; // Move left
            } else {
                left = m1 + 1; // Move right
            }
        }
        return 0.0; // Should not reach here
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median is: " + findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median is: " + findMedianSortedArrays(nums3, nums4));
    }
}
