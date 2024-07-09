/**
 * 63. Unique Paths II
 *
 * @link https://leetcode.com/problems/unique-paths-ii
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00063 {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    final int m = obstacleGrid.length;
    final int n = obstacleGrid[0].length;
    final int[][] dp = new int[m][n];
    dp[0][0] = obstacleGrid[0][0] == 0 ? 1 : -1;
    for (int i = 1; i < m; i++) {
      if (obstacleGrid[i][0] == 0) {
        if (dp[i - 1][0] == -1) {
          dp[i][0] = -1;
        } else {
          dp[i][0] = 1;
        }
      } else {
        dp[i][0] = -1;
      }
    }
    for (int i = 1; i < n; i++) {
      if (obstacleGrid[0][i] == 0) {
        if (dp[0][i - 1] == -1) {
          dp[0][i] = -1;
        } else {
          dp[0][i] = 1;
        }
      } else {
        dp[0][i] = -1;
      }
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (obstacleGrid[i][j] == 1) {
          dp[i][j] = -1;
        } else if (dp[i - 1][j] == -1 && dp[i][j - 1] == -1) {
          dp[i][j] = -1;
        } else if (dp[i - 1][j] == -1) {
          dp[i][j] = dp[i][j - 1];
        } else if (dp[i][j - 1] == -1) {
          dp[i][j] = dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
      }
    }
    return dp[m - 1][n - 1] != -1 ? dp[m - 1][n - 1] : 0;
  }

  public static void main(String[] args) {
    // final int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    final int[][] obstacleGrid = {{1}};


    final Leetcode00063 leetcode00063 = new Leetcode00063();
    final int uniquePathsWithObstacles = leetcode00063.uniquePathsWithObstacles(obstacleGrid);
    System.out.println("uniquePathsWithObstacles: " + uniquePathsWithObstacles);
  }
}
