/**
 * 64. Minimum Path Sum
 *
 * @link https://leetcode.com/problems/minimum-path-sum
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00064 {
  public int minPathSum(int[][] grid) {
    final int m = grid.length;
    final int n = grid[0].length;
    final int[][] dp = new int[m][n];
    dp[0][0] = grid[0][0];
    for (int i = 1; i < m; i++) {
      dp[i][0] += grid[i][0] + dp[i - 1][0];
    }
    for (int i = 1; i < n; i++) {
      dp[0][i] += grid[0][i] + dp[0][i - 1];
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
      }
    }
    return dp[m - 1][n - 1];
  }

  public static void main(String[] args) {
    final int[][] grid = {{100, 100, 100, 100}};

    final Leetcode00064 leetcode00064 = new Leetcode00064();
    final int minPathSum = leetcode00064.minPathSum(grid);
    System.out.println("minPathSum: " + minPathSum);
  }
}
