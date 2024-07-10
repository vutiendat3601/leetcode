import java.util.Stack;

/**
 * https://leetcode.com/problems/longest-valid-parentheses
 *
 * @link 32. Longest Valid Parentheses
 * @author vutiendat3601
 * @date 2024-07-10
 */
public class Leetcode00032 {
  public int longestValidParentheses(String s) {
    final int n = s.length();
    final int[] dp = new int[n];
    final Stack<Integer> stack = new Stack<>();
    final char[] chars = s.toCharArray();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (chars[i] == '(') {
        stack.push(i);
      } else if (chars[i] == ')') {
        if (!stack.isEmpty()) {
          final int idx = stack.pop();
          dp[i] += dp[i - 1] + 1;
          if (idx > 0) {
            dp[i] += dp[idx - 1];
          }
          ans = Math.max(ans, dp[i]);
        }
      }
    }

    return ans * 2;
  }

  public static void main(String[] args) {
    final String s = ")((()))()(()()()()()()";

    final Leetcode00032 leetcode00032 = new Leetcode00032();
    final int longestValidParentheses = leetcode00032.longestValidParentheses(s);
    System.out.println("longestValidParentheses: " + longestValidParentheses);
  }
}
