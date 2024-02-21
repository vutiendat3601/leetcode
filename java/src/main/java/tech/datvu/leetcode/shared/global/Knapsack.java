package tech.datvu.leetcode.shared.global;

public class Knapsack {
    public static int knapsack(int knapsackWeight, int[] weights, int[] values) {
        if (weights.length == values.length) {
            int[][] dp = new int[weights.length + 1][knapsackWeight + 1];
            for (int i = 1; i < weights.length; i++) {
                for (int j = 1; j <= knapsackWeight; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (weights[i - 1] < j) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                    }
                }
            }
            return dp[dp.length - 1][dp.length - 1];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] weights = { 2, 1, 4, 3 };
        int[] values = { 3, 3, 4, 2 };
        int res = knapsack(6, weights, values);
        System.out.println(res);
    }
}
