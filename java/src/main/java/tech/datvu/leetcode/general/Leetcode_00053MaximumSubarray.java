package tech.datvu.leetcode.general;

public class Leetcode_00053MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        // Dynamic programming - use Kadane's Algorithm
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i] > nums[i]) ? sum + nums[i] : nums[i];
            max = max >= sum ? max : sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        int res = maxSubArray(nums);
        System.out.println(res);
    }
}
