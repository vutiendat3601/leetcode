package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00241DifferentWaystoAddParentheses {
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String a = expression.substring(0, i);
                String b = expression.substring(i + 1);
                List<Integer> f = diffWaysToCompute(a);
                List<Integer> s = diffWaysToCompute(b);
                for (Integer x : f) {
                    for (Integer y : s) {
                        if (c == '+') {
                            ans.add(x + y);
                        } else if (c == '-') {
                            ans.add(x - y);
                        } else if (c == '*') {
                            ans.add(x * y);
                        }
                    }
                }
            }
        }
        if (ans.isEmpty()) {
            ans.add(Integer.valueOf(expression));
        }
        return ans;
    }

    public static void main(String[] args) {
        String expression = "2*3-1";
        List<Integer> res = diffWaysToCompute(expression);
        res.forEach(e -> System.out.println(e));
    }
}
