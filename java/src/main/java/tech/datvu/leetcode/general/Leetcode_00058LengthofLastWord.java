package tech.datvu.leetcode.general;

public class Leetcode_00058LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return res.length();
            }
            res.append(s.charAt(i));
        }
        return res.length();
    }

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

}
