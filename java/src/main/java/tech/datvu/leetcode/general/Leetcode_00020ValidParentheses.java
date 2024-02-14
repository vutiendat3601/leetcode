package tech.datvu.leetcode.general;

import java.util.Stack;

public class Leetcode_00020ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            char preChar = stack.empty() ? '\0' : stack.peek();
            if (preChar == '{' && c == '}') {
                stack.pop();
            } else if (preChar == '[' && c == ']') {
                stack.pop();
            } else if (preChar == '(' && c == ')') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValid(s));
    }
}
