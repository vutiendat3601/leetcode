/**
 * 91. Decode Ways
 *
 * @link https://leetcode.com/problems/decode-ways
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00091 {
  public int numDecodings(String s) {
    final int n = s.length();
    if (n < 2) {
      return s.charAt(0) == '0' ? 0 : 1;
    }
    final int[] dp = new int[n + 1];
    int twoCharNum = Integer.valueOf(s.substring(0, 2));
    if (twoCharNum < 10) {
      return 0;
    }
    if (twoCharNum <= 26) {
      dp[0] = 1;
    }
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      twoCharNum = Integer.valueOf(s.substring(i - 2, i));
      int num = twoCharNum % 10;
      if ((10 <= twoCharNum && twoCharNum <= 26) && num != 0) {
        dp[i] = dp[i - 1] + dp[i - 2];
      } else if (10 <= twoCharNum && twoCharNum <= 26) {
        dp[i] = dp[i - 2];
      } else if (num != 0) {
        dp[i] = dp[i - 1];
      }
    }
    return dp[n];
  }

  public static void main(String[] args) {
    final String s = "227";

    final Leetcode00091 leetcode00091 = new Leetcode00091();
    final int numDecodings = leetcode00091.numDecodings(s);
    System.out.println("numDecodings: " + numDecodings);
  }
}
