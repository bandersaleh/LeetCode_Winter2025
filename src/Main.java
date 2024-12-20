public class Main {
    public static void main(String[] args) {
        Main solution = new Main();

        // Example 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        // Example 2
//        int[] nums1 = {1, 2};
//        int[] nums2 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.5
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;

        while (left <= right) {
            int i = (left + right) / 2; // Partition index for nums1
            int j = (m + n + 1) / 2 - i; // Partition index for nums2

            // Boundaries for partitioning nums1
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            // Boundaries for partitioning nums2
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if we have found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If the combined length is odd
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    // If the combined length is even
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } else if (maxLeft1 > minRight2) {
                // Move the partition in nums1 to the left
                right = i - 1;
            } else {
                // Move the partition in nums1 to the right
                left = i + 1;
            }
        }

        // This point should never be reached if the input arrays are valid
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }


}
