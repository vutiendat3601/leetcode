package tech.datvu.leetcode;

public class Leetcode_00213HouseRobberII {

    public static int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int l = rob(nums, 0, nums.length - 2);
        int r = rob(nums, 1, nums.length - 1);
        return Math.max(l, r);
    }

    public static int rob(int[] nums, int lo, int hi) {
        int res = nums[lo];
        if (lo < hi) {
            int oldRes = 0;
            for (int i = lo + 1; i <= hi; i++) {
                int temp = res;
                res = nums[i] + oldRes > res ? nums[i] + oldRes : res;
                oldRes = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int res = rob(nums);
        System.out.println(res);
    }
}
