package tech.datvu.leetcode.general;

public class Leetcode_00121BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            } else if (prices[i] - prices[minIndex] > maxProfit) {
                maxProfit = prices[i] - prices[minIndex];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
