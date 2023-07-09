package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00561ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += Math.min(nums[i], nums[i + 1]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 3 };
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
}
