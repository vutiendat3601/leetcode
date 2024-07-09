/**
 * 72. Edit Distance
 *
 * @link https://leetcode.com/problems/edit-distance
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00072 {
  public int minDistance(String word1, String word2) {
    final int m = word1.length();
    final int n = word2.length();
    final int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      dp[i][0] = i;
    }
    for (int i = 0; i <= n; i++) {
      dp[0][i] = i;
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i - 1][j - 1];
        if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
          dp[i][j]++;
        }
        dp[i][j] = Math.min(dp[i][j], 1 + dp[i - 1][j]);
        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][j - 1]);
      }
    }
    return dp[m][n];
  }

  public static void main(String[] args) {
    final String word1 = "ros";
    final String word2 = "horse";

    final Leetcode00072 leetcode00072 = new Leetcode00072();
    final int minDistance = leetcode00072.minDistance(word1, word2);
    System.out.println("minDistance: " + minDistance);
  }
}
