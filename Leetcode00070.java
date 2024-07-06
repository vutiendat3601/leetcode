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
