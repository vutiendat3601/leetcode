/**
 * 518. Coin Change II
 *
 * @link https://leetcode.com/problems/coin-change-ii
 * @author vutiendat3601
 * @date 2024-07-16
 */
public class Leetcode00518 {
  public int change(int amount, int[] coins) {
    final int[] dp = new int[amount + 1];
    dp[0] = 1;
    for (int coin : coins) {
      for (int i = coin; i <= amount; i++) {
        if (i - coin >= 0) {
          dp[i] += dp[i - coin];
        }
      }
    }
    return dp[amount];
  }

  public static void main(String[] args) {
    final int amount = 5;
    final int[] coins = {1, 2, 5};

    final Leetcode00518 leetcode00518 = new Leetcode00518();
    final int result = leetcode00518.change(amount, coins);
    System.out.println("result: " + result);
  }
}
