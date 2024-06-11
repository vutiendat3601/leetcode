/**
 * 9. Palindrome Number
 *
 * @link https://leetcode.com/problems/palindrome-number
 * @author vutiendat3601
 * @date 2024-06-11
 */
public class Leetcode00009 {
  public boolean isPalindrome(int x) {

    // Convert to positive number
    final int target = x >= 0 ? x : -x;

    // Reverse number
    int num = 0;
    while (x > 0) {
      num *= 10;
      num += x % 10;
      x /= 10;
    }
    return num == target;
  }

  public static void main(String[] args) {
    final int x = 121;

    final Leetcode00009 leetcode00009 = new Leetcode00009();
    final boolean isPalindromeNum = leetcode00009.isPalindrome(x);
    System.out.println("isPalindromeNum: " + isPalindromeNum);
  }
}
