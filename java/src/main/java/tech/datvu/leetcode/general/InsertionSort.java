package tech.datvu.leetcode.general;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int j = 0;
            while (nums[j] < nums[i]) {
                j++;
            }
            int temp = nums[i];
            for (int k = i; k > j; k--) {
                nums[k] = nums[k - 1];
            }
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 1, 3 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
