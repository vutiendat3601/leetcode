/**
 * 377. Combination Sum IV
 *
 * @link https://leetcode.com/problems/combination-sum-iv
 * @author vutiendat3601
 * @date 2024-07-16
 */
public class Leetcode00377 {
  public int combinationSum4(int[] nums, int target) {
    final int[] dp = new int[target + 1];
    dp[0] = 1;
    for (int i = 1; i <= target; i++) {
      for (int k : nums) {
        if (i - k >= 0) {
          dp[i] += dp[i - k];
        }
      }
    }
    return dp[target];
  }

  public static void main(String[] args) {
    final int[] nums = {1, 2, 3};
    final int target = 4;

    final Leetcode00377 leetcode00377 = new Leetcode00377();
    final int result = leetcode00377.combinationSum4(nums, target);
    System.out.println("result: " + result);
  }
}
