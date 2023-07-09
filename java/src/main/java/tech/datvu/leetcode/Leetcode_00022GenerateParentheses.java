package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00022GenerateParentheses {

    private static List<String> res = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder(n * 2);
        gen(sb, n, 0, 0, 0);
        return res;
    }

    public static void gen(StringBuilder sb, int n, int iTh, int left, int right) {
        if (left < n) {
            sb.replace(iTh, iTh + 1, "(");
            gen(sb, n, iTh + 1, left + 1, right + 1);
        }
        if (right > 0) {
            sb.replace(iTh, iTh + 1, ")");
            if (iTh == n * 2 - 1) {
                res.add(sb.toString());
            } else {
                gen(sb, n, iTh + 1, left, right - 1);
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> res = generateParenthesis(n);
        res.forEach(e -> System.out.println(e));
    }
}
