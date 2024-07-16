import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * @link https://leetcode.com/problems/valid-parentheses
 * @author vutiendat3601
 * @date 2024-07-10
 */
public class Leetcode00020 {
  public boolean isValid(String s) {
    final Stack<Character> stack = new Stack<>();
    final char[] chars = s.toCharArray();
    for (char c : chars) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        final char lastC = stack.isEmpty() ? '\0' : stack.peek();
        if (lastC == '(' && c == ')') {
          stack.pop();
        } else if (lastC == '[' && c == ']') {
          stack.pop();
        } else if (lastC == '{' && c == '}') {
          stack.pop();
        } else {
          stack.push(c);
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    final String s = "((()))";

    final Leetcode00020 leetcode00020 = new Leetcode00020();
    final boolean isValid = leetcode00020.isValid(s);
    System.out.println("isValid: " + isValid);
  }
}
