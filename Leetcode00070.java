/**
 * 70. Climbing Stairs
 *
 * @link https://leetcode.com/problems/climbing-stairs
 * @author vutiendat3601
 * @date 2024-07-06
 */
public class Leetcode00070 {
  public int climbStairs(int n) {
    int[] cnts = new int[n + 1];
    cnts[0] = 1;
    cnts[1] = 1;
    for (int i = 2; i <= n; i++) {
      cnts[i] = cnts[i - 1] + cnts[i - 2];
    }
    return cnts[n];
  }

  public static void main(String[] args) {
    final int n = 3;

    final Leetcode00070 leetcode00070 = new Leetcode00070();
    final int result = leetcode00070.climbStairs(n);
    System.out.println("result: " + result);
  }
}

/**
 * You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1
 * or 2 steps. In how many distinct ways can you climb to the top at most k jumps?
 */
class Leetcode00070Version2 {

  public int climbStairs(int n, int k) {
    final int[][] dp = new int[n + 1][k + 1];
    for (int i = 0; i <= k; i++) {
      dp[0][i] = 1;
      dp[1][i] = 1;
    }
    dp[1][0] = 0;

    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= k; j++) {
        dp[i][j] = dp[i - 1][j - 1] + dp[i - 2][j - 1];
      }
    }
    int result = 0;
    for (int i = 0; i <= k; i++) {
      result += dp[n][i];
    }

    return result;
  }

  /* public static void main(String[] args) {
    final int n = 5;
    final int k = 2;

    final Leetcode00070_ test = new Leetcode00070_();
    final int result = test.climbStairs(n, k);
    System.out.println("result: " + result);
  } */
}
