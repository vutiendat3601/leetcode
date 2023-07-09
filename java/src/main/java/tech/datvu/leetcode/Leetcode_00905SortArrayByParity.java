package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00905SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if ((nums[j] & 1) == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 7, 6, 9, 5, 1, 2 };
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
}
