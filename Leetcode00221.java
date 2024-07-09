/**
 * 221. Maximal Square
 *
 * @link https://leetcode.com/problems/maximal-square
 * @author vutiendat3601
 * @date 2024-07-10
 */
public class Leetcode00221 {
  public int maximalSquare(char[][] matrix) {
    final int m = matrix.length;
    final int n = matrix[0].length;
    final int[][] dp = new int[m][n];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      dp[0][i] = matrix[0][i] - '0';
      ans = Math.max(ans, dp[0][i]);
    }
    for (int i = 1; i < m; i++) {
      dp[i][0] = matrix[i][0] - '0';
      ans = Math.max(ans, dp[i][0]);
      for (int j = 1; j < n; j++) {
        dp[i][j] = matrix[i][j] - '0';
        if (matrix[i][j] == '1') {
          dp[i][j] += Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
          ans = Math.max(ans, dp[i][j]);
        }
      }
    }
    return ans * ans;
  }

  public static void main(String[] args) {
    final char[][] matrix = {
      {'1', '0', '1', '0', '0'},
      {'1', '0', '1', '1', '1'},
      {'1', '1', '1', '1', '1'},
      {'1', '0', '0', '1', '0'}
    };

    final Leetcode00221 leetcode00221 = new Leetcode00221();
    final int maximalSquare = leetcode00221.maximalSquare(matrix);
    System.out.println("maximalSquare: " + maximalSquare);
  }
}
