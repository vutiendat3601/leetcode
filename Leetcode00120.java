import java.util.List;

/**
 * 120. Triangle
 *
 * @link https://leetcode.com/problems/triangle
 * @author vutiendat3601
 * @date 2024-07-09
 */
public class Leetcode00120 {
  public int minimumTotal(List<List<Integer>> triangle) {
    final int m = triangle.size();
    final int n = triangle.get(m - 1).size();
    final int[][] dp = new int[m][n];
    dp[0][0] = triangle.get(0).get(0);
    for (int i = 1; i < m; i++) {
      final List<Integer> row = triangle.get(i);
      for (int j = 0; j <= i; j++) {
        final int leftIdx = j - 1;
        final int rightIdx = j;
        if (leftIdx >= 0 && rightIdx <= i - 1) {
          dp[i][j] = row.get(j) + Math.min(dp[i-1][leftIdx], dp[i-1][rightIdx]);
        } else if (leftIdx >= 0) {
          dp[i][j] = row.get(j) + dp[i-1][leftIdx];
        } else {
          dp[i][j] = row.get(j) + dp[i-1][rightIdx];
        }
      }
    }
    int ans = dp[m - 1][0];
    for (int i = 1; i < n; i++) {
      ans = Math.min(ans, dp[m - 1][i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    final List<List<Integer>> triangle =
        List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

    final Leetcode00120 leetcode00120 = new Leetcode00120();
    final int minimumTotal = leetcode00120.minimumTotal(triangle);
    System.out.println("minimumTotal: " + minimumTotal);
  }
}
