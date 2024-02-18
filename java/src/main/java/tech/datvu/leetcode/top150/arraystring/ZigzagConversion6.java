package tech.datvu.leetcode.top150.arraystring;

public class ZigzagConversion6 {
    public String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder(s);
        if (numRows > 1) {
            res = new StringBuilder();
            int evenD = 2 * numRows - 2;
            int iC = 0;
            while (iC < s.length()) {
                res.append(s.charAt(iC));
                iC += evenD;
            }
            for (int r = 1; r < numRows - 1; r++) {
                iC = r;
                int iG = iC + (evenD - 2 * r);
                while (iC < s.length() && iG < s.length()) {
                    res.append(s.charAt(iC));
                    res.append(s.charAt(iG));
                    iC += evenD;
                    iG = iC + (evenD - 2 * r);
                }
                if (iC < s.length()) {
                    res.append(s.charAt(iC));
                }
            }
            iC = numRows - 1;
            while (iC < s.length()) {
                res.append(s.charAt(iC));
                iC += evenD;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // String s = "PAYPALISHIRING";
        String s = "PAYPALISHIRING";

        int numRows = 3;
        ZigzagConversion6 zigzagConversion6 = new ZigzagConversion6();
        String res = zigzagConversion6.convert(s, numRows);
        System.out.println(res);
    }
}
