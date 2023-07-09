package tech.datvu.leetcode;

import java.util.Stack;

public class Leetcode_00020ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char preChar = stack.empty() ? ' ' : stack.peek();
            if (c == ']' && preChar == '[') {
                stack.pop();
            } else if (c == ')' && preChar == '(') {
                stack.pop();
            } else if (c == '}' && preChar == '{') {
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
