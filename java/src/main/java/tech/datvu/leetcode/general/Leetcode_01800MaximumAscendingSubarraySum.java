package tech.datvu.leetcode.general;

public class Leetcode_01800MaximumAscendingSubarraySum {

    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                max = max > sum ? max : sum;
                sum = nums[i];
            }
        }
        max = max > sum ? max : sum;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        int res = maxAscendingSum(nums);
        System.out.println(res);
    }
}
