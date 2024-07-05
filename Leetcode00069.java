/**
 * 69. Sqrt(x)
 *
 * @link https://leetcode.com/problems/sqrtx
 * @author vutiendat3601
 * @date 2024-07-05
 */
public class Leetcode00069 {
  public int mySqrt(int x) {
    int begin = 0;
    int end = x;
    int ans = 0;
    while (begin <= end) {
      int mid = begin + (end - begin) / 2;
      long sqr = (long) mid * mid;
      if (sqr <= x) {
        ans = mid;
        begin = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    final int x = 1;

    final Leetcode00069 leetcode00069 = new Leetcode00069();
    final int sqrt = leetcode00069.mySqrt(x);
    System.out.println("sqrt: " + sqrt);
  }
}
