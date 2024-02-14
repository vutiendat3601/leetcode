package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00088MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Neu mang 2 khong co phan tu
        if (nums2.length == 0) {
            return;
        }

        int i = 0;
        int j = 0;

        // So sanh tung phan tu mang 1 voi mang 2
        // Neu phan tu mang 1 lon hon hoac bang mang 2 thi insert phan tu mang thu 2 vao
        // mang 1
        while (i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                insertElement(nums1, i, nums2[j], m++);
                j++;
            }
            i++;
        }

        // Neu index da tro qua phan tu lon nhat cua mang 1 va mang 2 van con phan tu
        while (m < nums1.length) {
            insertElement(nums1, i++, nums2[j++], m++);
        }
    }

    // Sao chep phan tu ve cuoi mang va chen phan tu vao vi tri
    private static void insertElement(int[] nums, int pos, int val, int curLen) {
        for (int i = curLen; i > pos; i--) {
            nums[i] = nums[i - 1];
        }
        nums[pos] = val;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }
}
