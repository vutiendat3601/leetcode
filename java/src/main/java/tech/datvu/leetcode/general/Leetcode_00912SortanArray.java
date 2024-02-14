package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00912SortanArray {

    public static void merge(int[] nums, int l, int m, int r) {
        int[] lNums = new int[m - l + 1];
        int[] rNums = new int[r - m];
        for (int i = 0; i < lNums.length; i++) {
            lNums[i] = nums[l + i];
        }
        for (int i = 0; i < rNums.length; i++) {
            rNums[i] = nums[m + 1 + i];
        }

        int lI = 0, rI = 0, mI = l;
        while (lI < lNums.length && rI < rNums.length) {
            if (lNums[lI] < rNums[rI]) {
                nums[mI] = lNums[lI++];
            } else {
                nums[mI] = rNums[rI++];
            }
            mI++;
        }

        while (lI < lNums.length) {
            nums[mI++] = lNums[lI++];
        }
        while (rI < rNums.length) {
            nums[mI++] = rNums[rI++];
        }
    }

    public static void sort(int[] nums, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(nums, l, m);
            sort(nums, m + 1, r);
            merge(nums, l, m, r);
        }
    }

    public static int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
