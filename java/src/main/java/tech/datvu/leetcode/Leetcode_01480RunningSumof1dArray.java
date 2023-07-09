package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_01480RunningSumof1dArray {

    public static int[] runningSum(int[] nums) {
        int[] preSums = new int[nums.length];
        preSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSums[i] = preSums[i - 1] + nums[i];
        }
        return preSums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }
}
