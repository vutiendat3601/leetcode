/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 * @author vutiendat3601
 * @date 2024-07-06
 */
public class Leetcode00121 {
  public int maxProfit(int[] prices) {
    int ans = 0;
    int lastBuy = prices[0];
    for (int price : prices) {
      if (price > lastBuy) {
        ans = Math.max(ans, price - lastBuy);
      } else {
        lastBuy = price;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    final int[] prices = {7, 1, 5, 3, 6, 4};

    final Leetcode00121 leetcode00121 = new Leetcode00121();
    final int maxProfit = leetcode00121.maxProfit(prices);
    System.out.println("maxProfit: " + maxProfit);
  }
}
