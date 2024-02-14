package tech.datvu.leetcode.general;

import java.util.Stack;

public class Leetcode_00150EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for (String t : tokens) {
            if (isDigits(t)) {
                s.push(t);
            } else {
                int b = Integer.parseInt(s.pop());
                int a = Integer.parseInt(s.pop());
                s.push(String.valueOf(calculate(a, b, t)));
            }
        }
        return Integer.parseInt(s.peek());
    }

    private static int calculate(int a, int b, String operator) {
        int res = 0;
        if (operator.equals("+")) {
            res = a + b;
        } else if (operator.equals("-")) {
            res = a - b;
        } else if (operator.equals("*")) {
            res = a * b;
        } else if (operator.equals("/")) {
            res = a / b;
        }
        return res;
    }

    private static boolean isDigits(String s) {
        if (s.length() < 2 && !Character.isDigit(s.charAt(0))) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c != '-' && !Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        int res = evalRPN(tokens);
        System.out.println(res);
    }
}
