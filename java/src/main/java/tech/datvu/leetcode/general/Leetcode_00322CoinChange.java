package tech.datvu.leetcode.general;

public class Leetcode_00322CoinChange {
  private static final int[] NUM_OF_COINS = new int[10001];

  public static int coinChange(int[] coins, int amount) {
    NUM_OF_COINS[0] = 0;
    for (int i = 1; i <= amount; i++) {
      NUM_OF_COINS[i] = Integer.MAX_VALUE;
      for (int coin : coins) {
        if (i - coin == 0) {
          NUM_OF_COINS[i] = 1;
        } else if (i - coin > 0 && NUM_OF_COINS[i - coin] != 0) {
          if (NUM_OF_COINS[i - coin] + 1 < NUM_OF_COINS[i]) {
            NUM_OF_COINS[i] = NUM_OF_COINS[i - coin] + 1;
          }
        }
      }
      if (NUM_OF_COINS[i] == Integer.MAX_VALUE) {
        NUM_OF_COINS[i] = 0;
      }
    }
    return amount == 0 ? 0 : NUM_OF_COINS[amount] != 0 ? NUM_OF_COINS[amount] : -1;
  }

  public static void main(String[] args) {
    int[] coins = {2};
    int amount = 3;
    int res = coinChange(coins, amount);
    System.out.println(res);
  }
}
