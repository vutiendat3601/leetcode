package tech.datvu.leetcode;

public class Leetcode_01961CheckIfStringIsaPrefixofArray {

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder cmp = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            cmp.append(words[i]);
            if (!s.startsWith(cmp.toString())) {
                return false;
            } else if (cmp.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[] { "apples", "i", "love", "leetcode" }));
    }
}
