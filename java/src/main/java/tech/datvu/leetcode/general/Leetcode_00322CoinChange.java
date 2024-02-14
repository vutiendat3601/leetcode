package tech.datvu.leetcode.general;

public class Leetcode_00322CoinChange {

    public static int coinChange(int[] coins, int amount) {

        final int MAX_VAL = Integer.MAX_VALUE -1;
        // Arrays.sort(coins);

        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[0][i] = MAX_VAL;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                dp[i][j] = dp[i - 1][j];
                int temp = j / coins[i - 1];
                if (dp[i - 1][j % coins[i - 1]] < MAX_VAL) {
                    temp += dp[i - 1][j % coins[i - 1]];
                }
                dp[i][j] = Math.min(dp[i][j], temp);
            }
        }
        return dp[coins.length][amount] == MAX_VAL ? -1 : dp[coins.length][amount];
    }

    public static void main(String[] args) {
        int[] coins = { 186, 419, 83, 408 };
        int amount = 6249;
        int res = coinChange(coins, amount);
        System.out.println(res);
    }

}
