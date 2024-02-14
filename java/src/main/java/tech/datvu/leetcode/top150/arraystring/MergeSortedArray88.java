package tech.datvu.leetcode.top150.arraystring;

import java.util.Arrays;

public class MergeSortedArray88 {

    // ## Two-pointers technique
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        int i = m - 1, j = n - 1;
        while (j >= 0 && i >= 0) {
            if (nums2[j] >= nums1[i]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1 };
        int[] nums2 = { 0 };
        int n = nums2.length;
        int m = nums1.length - n;
        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        mergeSortedArray88.merge(nums1, m, nums2, n);
        System.out.println("########## Result ##########");
        System.out.println("Nums1: " + Arrays.toString(nums1));
        System.out.println("##############################");
    }
}
