package tech.datvu.leetcode.top150.arraystring;

public class BestTimeBuySellStockII122 {
    public int maxProfit(int[] prices) {
        int sum = 0, res = 0, curPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - curPrice > sum) {
                sum = prices[i] - curPrice;
            } else {
                curPrice = prices[i];
                res += sum;
                sum = 0;
            }
        }
        res += sum;
        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        BestTimeBuySellStockII122 bestTimeBuySellStockII122 = new BestTimeBuySellStockII122();
        System.out.println(bestTimeBuySellStockII122.maxProfit(prices));
    }
}
