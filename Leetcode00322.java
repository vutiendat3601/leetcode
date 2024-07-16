/**
 * 322. Coin Change
 *
 * @link https://leetcode.com/problems/coin-change
 * @author vutiendat3601
 * @date 2024-07-16
 */
public class Leetcode00322 {
  public int coinChange(int[] coins, int amount) {
    final int[] dp = new int[amount + 1];
    for (int i = 1; i <= amount; i++) {
      dp[i] = Integer.MAX_VALUE;
      for (int coin : coins) {
        if (i - coin >= 0 && dp[i - coin] >= 0) {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
      if (dp[i] == Integer.MAX_VALUE) {
        dp[i] = -1;
      }
    }
    return dp[amount];
  }

  public static void main(String[] args) {
    final int[] coins = {1, 2, 5};
    final int amount = 11;
    final Leetcode00322 leetcode00322 = new Leetcode00322();
    final int result = leetcode00322.coinChange(coins, amount);
    System.out.println("result: " + result);
  }
}
