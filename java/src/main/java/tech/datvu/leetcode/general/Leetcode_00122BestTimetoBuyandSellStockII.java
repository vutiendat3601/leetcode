package tech.datvu.leetcode.general;

public class Leetcode_00122BestTimetoBuyandSellStockII {

    public static int maxProfit(int[] prices) {
        int s = 0;
        int res = 0;
        int cur = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - cur > s) {
                s = prices[i] - cur > s ? prices[i] - cur : s;
            } else {
                cur = prices[i];
                res += s;
                s = 0;
            }
        }
        res += s;
        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int res = maxProfit(prices);
        System.out.println(res);
    }
}
