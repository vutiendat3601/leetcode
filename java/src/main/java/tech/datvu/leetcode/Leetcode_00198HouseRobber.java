package tech.datvu.leetcode;

public class Leetcode_00198HouseRobber {

    public static int rob(int[] nums) {
        int res = nums[0];
        int oldRes = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = res;
            res = nums[i] + oldRes > res ? nums[i] + oldRes : res;
            oldRes = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        int res = rob(nums);
        System.out.println(res);
    }
}
