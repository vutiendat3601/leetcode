package tech.datvu.leetcode.general;

/**
 * Find min, max of two arrays and continue with smaller size arrays which the
 * min, max found before was removed
 */
public class Leetcode_00004MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1 = 0, right1 = nums1.length - 1;
        int left2 = 0, right2 = nums2.length - 1;
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE, n = nums1.length + nums2.length;
        while (n > 0) {
            if (left1 <= right1 && left2 <= right2) {
                min = nums1[left1] < nums2[left2] ? nums1[left1++] : nums2[left2++];
                max = nums1[right1] > nums2[right2] ? nums1[right1--] : nums2[right2--];
            } else if (left1 <= right1) {
                min = nums1[left1++];
                max = nums1[right1--];
            } else if (left2 <= right2) {
                min = nums2[left2++];
                max = nums2[right2--];
            }
            n -= 2;
        }
        return (min + max) / 2.0D;
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = { 1, 2, 3 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
