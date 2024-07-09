/**
 * 62. Unique Paths
 *
 * @link https://leetcode.com/problems/unique-paths
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00062 {
  public int uniquePaths(int m, int n) {
    final int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      dp[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[m - 1][n - 1];
  }

  public static void main(String[] args) {
    final int m = 3;
    final int n = 7;

    final Leetcode00062 leetcode00062 = new Leetcode00062();
    final int uniquePaths = leetcode00062.uniquePaths(m, n);
    System.out.println("uniquePaths: " + uniquePaths);
  }
}
