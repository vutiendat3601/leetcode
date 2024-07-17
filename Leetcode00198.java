/**
 * 198. House Robber
 *
 * @link https://leetcode.com/problems/house-robber
 * @author vutiendat3601
 * @date 2024-07-17
 */
public class Leetcode00198 {
  public int rob(int[] nums) {
    final int n = nums.length;
    final int[] dp = new int[n];
    dp[0] = nums[0];
    if (n > 1) {
      dp[1] = Math.max(dp[0], nums[1]);
    }
    for (int i = 2; i < n; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
    }
    return dp[n - 1];
  }

  public static void main(String[] args) {
    final int[] nums = {2, 7, 9, 3, 1};

    final Leetcode00198 leetcode00198 = new Leetcode00198();
    final int result = leetcode00198.rob(nums);
    System.out.println("result: " + result);
  }
}
