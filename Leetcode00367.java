/**
 * 367. Valid Perfect Square
 *
 * @link https://leetcode.com/problems/valid-perfect-square
 * @author vutiendat3601
 * @date 2024-06-28
 */
public class Leetcode00367 {
  public boolean isPerfectSquare(int num) {
    int begin = 1;
    int end = num;
    while (begin <= end) {
      final int mid = (begin + end) / 2;
      final long square = (long) mid * mid;
      if (square == num) {
        return true;
      } else if (square < num) {
        begin = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    final int num = 16;

    final Leetcode00367 leetcode00367 = new Leetcode00367();
    final boolean isPerfectSquare = leetcode00367.isPerfectSquare(num);
    System.out.println("isPerfectSquare: " + isPerfectSquare);
  }
}
