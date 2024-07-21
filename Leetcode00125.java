/**
 * 125. Valid Palindrome
 *
 * @link https://leetcode.com/problems/valid-palindrome
 * @author vutiendat3601
 * @date 2024-07-21
 */
public class Leetcode00125 {
  public boolean isPalindrome(String s) {
    final char[] chars = s.toCharArray();
    final StringBuilder sb = new StringBuilder();
    for (char c : chars) {
      if (('0' <= c && c <= '9') || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
        sb.append(c);
      }
    }
    final String str = sb.toString();
    final String reversedStr = sb.reverse().toString();
    return str.equalsIgnoreCase(reversedStr);
  }

  public static void main(String[] args) {
    final String s = "A man, a plan, a canal: Panama";

    final Leetcode00125 leetcode00125 = new Leetcode00125();
    final boolean result = leetcode00125.isPalindrome(s);
    System.out.println("result: " + result);
  }
}
