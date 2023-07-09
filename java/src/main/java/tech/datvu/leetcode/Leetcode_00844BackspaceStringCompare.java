package tech.datvu.leetcode;

public class Leetcode_00844BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        return findResult(s).equals(findResult(t));
    }

    public static String findResult(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (res.length() != 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxo#j##tw";

        System.out.println(backspaceCompare(s, t));
    }
}
