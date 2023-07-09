package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00017LetterCombinationsofaPhoneNumber {

    private static String[] base = new String[10];
    private static String cur = "";
    static {
        base[2] = "abc";
        base[3] = "def";
        base[4] = "ghi";
        base[5] = "jkl";
        base[6] = "mno";
        base[7] = "pqrs";
        base[8] = "tuv";
        base[9] = "wxyz";
    }

    public static List<String> letterCombinations(String digits) {
        // char[] cDigits = digits.toCharArray();
        List<String> res = new ArrayList<>();
        if (!digits.isEmpty()) {
            gen(res, digits, 0);
        }
        return res;
    }

    public static void gen(List<String> res, String digits, int iTh) {
        char[] temp = base[Integer.parseInt(digits.substring(iTh, iTh + 1))].toCharArray();
        for (char c : temp) {
            cur += c;
            if (iTh == digits.length() - 1) {
                res.add(cur);
                if (cur.length() > 0) {
                    cur = cur.substring(0, iTh);
                }
            } else {
                gen(res, digits, iTh + 1);
                if (cur.length() > 0) {
                    cur = cur.substring(0, iTh);
                }
            }
        }
    }

    public static void main(String[] args) {
        String digits = "";
        List<String> res = letterCombinations(digits);
        res.forEach(e -> System.out.println(e));
    }
}
