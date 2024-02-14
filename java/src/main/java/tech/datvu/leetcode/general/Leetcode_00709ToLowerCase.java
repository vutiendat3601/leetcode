package tech.datvu.leetcode.general;

public class Leetcode_00709ToLowerCase {
    public static String toLowerCase(String s) {
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                res.setCharAt(i, (char) (c + 32));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Vu Tien Dat";
        String res = toLowerCase(s);
        System.out.println(res);
    }
}
