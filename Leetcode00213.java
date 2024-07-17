/**
 * 213. House Robber II
 *
 * @link https://leetcode.com/problems/house-robber-ii
 * @author vutiendat3601
 * @date 2024-07-17
 */
public class Leetcode00213 {
  public int rob(int[] nums) {
    int begin = 0;
    int end = nums.length - 1;
    if (end < 1) {
      return nums[0];
    }
    return Math.max(rob(nums, begin, end - 1), rob(nums, 1, end));
  }

  private int rob(int[] nums, int begin, int end) {
    if (begin == end) {
      return nums[begin];
    }
    int[] dp = new int[nums.length - 1];
    dp[0] = nums[begin];
    if (begin + 1 <= end) {
      dp[1] = Math.max(nums[begin], nums[begin + 1]);
    }
    for (int i = 2; i < dp.length; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[begin + i]);
    }
    return dp[dp.length - 1];
  }

  public static void main(String[] args) {
    final int[] nums = {1, 2, 3, 1};

    final Leetcode00198 leetcode00198 = new Leetcode00198();
    final int result = leetcode00198.rob(nums);
    System.out.println("result: " + result);
  }
}
