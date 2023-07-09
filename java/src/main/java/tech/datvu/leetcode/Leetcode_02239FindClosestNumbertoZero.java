package tech.datvu.leetcode;

public class Leetcode_02239FindClosestNumbertoZero {
    public static int findClosestNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(res)) {
                res = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(res) && nums[i] > 0) {
                res = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -2, 1, 4, 8 };
        int res = findClosestNumber(nums);
        System.out.println(res);
    }
}
