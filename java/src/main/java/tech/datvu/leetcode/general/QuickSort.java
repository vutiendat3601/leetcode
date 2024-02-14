package tech.datvu.leetcode.general;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(nums, l, mid);
            sort(nums, mid + 1, r);
            merge(nums, l, mid, r);
        }
    }

    public static void merge(int[] nums, int l, int mid, int r) {
        int[] lA = new int[mid - l + 1];
        int[] rA = new int[r - mid];

        for (int i = 0; i < lA.length; i++) {
            lA[i] = nums[l + i];
        }

        for (int i = 0; i < rA.length; i++) {
            rA[i] = nums[mid + 1 + i];
        }

        int mIndex = l;
        int lIndex = 0;
        int rIndex = 0;

        while (lIndex < lA.length && rIndex < rA.length) {
            if (lA[lIndex] < rA[rIndex]) {
                nums[mIndex++] = lA[lIndex++];
            } else {
                nums[mIndex++] = rA[rIndex++];
            }
        }

        while (lIndex < lA.length) {
            nums[mIndex++] = lA[lIndex++];

        }

        while (rIndex < rA.length) {
            nums[mIndex++] = rA[rIndex++];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 3, 1, 0, -2 };
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
