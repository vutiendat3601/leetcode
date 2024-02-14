package tech.datvu.leetcode.general;

public class Leetcode_01827MinimumOperationstoMaketheArrayIncreasing {
    public static int minOperations(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                res += (nums[i - 1] + 1 - nums[i]);
                nums[i] = nums[i - 1] + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 2, 4, 1 };
        int res = minOperations(nums);
        System.out.println(res);
    }
}
