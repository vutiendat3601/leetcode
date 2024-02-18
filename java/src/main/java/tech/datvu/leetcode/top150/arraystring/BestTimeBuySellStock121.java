package tech.datvu.leetcode.top150.arraystring;

public class BestTimeBuySellStock121 {
    public int maxProfit(int[] prices) {
        int minIndex = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int profit = prices[i] - prices[minIndex];
            if (profit < 0) {
                minIndex = i;
            } else {
                maxProfit = maxProfit > profit ? maxProfit : profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        BestTimeBuySellStock121 bestTimeBuySellStock121 = new BestTimeBuySellStock121();
        int max = bestTimeBuySellStock121.maxProfit(prices);
        System.out.println(max);
    }
}
