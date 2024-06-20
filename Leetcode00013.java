/**
 * 13. Roman to Integer
 *
 * @link https://leetcode.com/problems/roman-to-integer
 * @author vutiendat3601
 * @date 2024-06-20
 */
public class Leetcode00013 {
  public int romanToInt(String s) {
    int ans = 0, num = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      switch (s.charAt(i)) {
        case 'I':
          num = 1;
          break;
        case 'V':
          num = 5;
          break;
        case 'X':
          num = 10;
          break;
        case 'L':
          num = 50;
          break;
        case 'C':
          num = 100;
          break;
        case 'D':
          num = 500;
          break;
        case 'M':
          num = 1000;
          break;
      }
      if (4 * num < ans) {
        ans -= num;
      } else {
        ans += num;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    final String s = "XIX";

    final Leetcode00013 leetcode00013 = new Leetcode00013();
    final int romanToInt = leetcode00013.romanToInt(s);
    System.out.println("romanToInt: " + romanToInt);
  }
}
