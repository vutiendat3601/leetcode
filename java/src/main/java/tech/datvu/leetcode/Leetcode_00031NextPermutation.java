package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00031NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length - 1;

        int i = n;
        boolean isChanged = false;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                int j = n;
                while (nums[i - 1] >= nums[j]) {
                    j--;
                }
                swap(nums, i - 1, j);
                for (j = 0; j < (n - i + 1) / 2; j++) {
                    swap(nums, i + j, n - j);
                }
                i = n;
                // printRes();
                isChanged = true;
                break;
            } else {
                i--;
            }
        }
        
        if (!isChanged) {
            Arrays.sort(nums);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
