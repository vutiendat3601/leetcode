package tech.datvu.leetcode.top150.arraystring;

public class JumpGame45 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        int lastIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = lastIdx; j < i; j++) {
                if (j + nums[j] >= i) {
                    dp[i] = dp[j] + 1;
                    lastIdx = j;
                    break;
                }
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3 };
        // 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2
        JumpGame45 jumpGame45 = new JumpGame45();
        int res = jumpGame45.jump(nums);
        System.out.println(res);
    }
}
