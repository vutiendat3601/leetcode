package tech.datvu.leetcode.general;

public class Leetcode_00674LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] nums) {
        int res = 1;
        int cnt = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                cnt++;
            } else {
                res = res > cnt ? res : cnt;
                cnt = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2,2,2,2,2 };
        int res = findLengthOfLCIS(nums);
        System.out.println(res);
    }
}
