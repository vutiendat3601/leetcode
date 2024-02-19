package tech.datvu.leetcode.general;

public class Leetcode_00300LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] maxLens = new int[nums.length];
        int max = 1;
        for (int i = 0; i < maxLens.length; i++) {
            maxLens[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLens[i] = Math.max(maxLens[i], maxLens[j] + 1);
                }
            }
            max = max > maxLens[i] ? max : maxLens[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
        int res = lengthOfLIS(nums);
        System.out.println(res);
    }
}
