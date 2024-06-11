/**
 * 7. Reverse Integer
 *
 * @link https://leetcode.com/problems/reverse-integer
 * @author vutiendat3601
 * @date 2024-06-11
 */
public class Leetcode00007 {
  public int reverse(int x) {
    // Store sign of number x and convert x to positive number
    final int sign = x >= 0 ? 1 : -1;
    x *= sign;
    long reverseX = 0;

    // Calculate the reverse number
    while (x > 0) {
      reverseX *= 10;
      int num = x % 10;
      reverseX += num;
      x /= 10;
    }

    // Check the result number is outside of range [-2^31, 2^31 - 1]
    if (reverseX > Integer.MAX_VALUE || sign * reverseX < Integer.MIN_VALUE) {
      return 0;
    }
    return (int) reverseX * sign;
  }

  public static void main(String[] args) {
    final int x = 1534236469;
    final Leetcode00007 leetcode00007 = new Leetcode00007();
    final int reverseX = leetcode00007.reverse(x);
    System.out.println("reverseX: " + reverseX);
  }
}
