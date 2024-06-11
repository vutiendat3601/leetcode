/**
 * 8. String to Integer (atoi)
 *
 * @link https://leetcode.com/problems/reverse-integer
 * @author vutiendat3601
 * @date 2024-06-11
 */
public class Leetcode00008 {
  public int myAtoi(String s) {
    int i = 0;
    long num = 0;
    int sign = 1;

    // Find the first number or sign [+, -], otherwise, if not " " return 0
    while (i < s.length()) {
      final char c = s.charAt(i);
      if (Character.isDigit(c)) {
        break;
      } else if ((c == '-' || c == '+')
          && (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1)))) {
        sign = c == '-' ? -1 : 1;
        i++;
        break;
      } else if (c != ' ') {
        return 0;
      }
      i++;
    }
    // Parse character to number until reach to first not digit character
    while (i < s.length()) {
      final char c = s.charAt(i);
      if (!Character.isDigit(c)) {
        break;
      } else {
        num *= 10;
        num += Integer.parseInt(c + "");
        // Check if the real number smaller than or equals MIN_INTEGER
        long result = num * sign;
        if (result <= Integer.MIN_VALUE) {
          return Integer.MIN_VALUE;
        }
        // Check if the real number bigger than or equals MAX_INTEGER
        if (result >= Integer.MAX_VALUE) {
          return Integer.MAX_VALUE;
        }
      }
      i++;
    }
    num *= sign;
    return (int) num;
  }

  public static void main(String[] args) {
    final String s = "-2147483648";

    final Leetcode00008 leetcode00008 = new Leetcode00008();
    final int num = leetcode00008.myAtoi(s);
    System.out.println("num: " + num);
  }
}
