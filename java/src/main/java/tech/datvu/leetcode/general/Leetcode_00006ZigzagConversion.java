package tech.datvu.leetcode.general;

public class Leetcode_00006ZigzagConversion {
    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        String res = "";
        int step = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int vStep = ((numRows - 1) * 2) - (2 * i);
            for (int j = i; j < s.length(); j += step) {
                res += chars[j];
                if (0 < i && i < numRows - 1 && j + vStep < s.length()) {
                    res += chars[j + vStep];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 4));
    }
}
