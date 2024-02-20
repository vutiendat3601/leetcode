package tech.datvu.leetcode.top150.arraystring;

public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < i) {
                return false;
            }
            dp[i] = i + nums[i] > dp[i - 1] ? i + nums[i] : dp[i - 1];
        }
        return dp[nums.length - 1] >= nums.length - 1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 0 };
        JumpGame55 jumpGame55 = new JumpGame55();
        boolean res = jumpGame55.canJump(nums);
        System.out.println(res);
    }
}
