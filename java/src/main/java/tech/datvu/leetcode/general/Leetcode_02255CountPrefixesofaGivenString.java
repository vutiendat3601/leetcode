package tech.datvu.leetcode.general;

public class Leetcode_02255CountPrefixesofaGivenString {

    public static int countPrefixes(String[] words, String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < words.length; i++) {
            int wordLen = words[i].length();
            String prefix = wordLen <= n ? s.substring(0, wordLen) : "";
            res = prefix.equals(words[i]) ? res + 1 : res;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "a", "b", "c", "ab", "bc", "abc" };
        String s = "abc";
        int res = countPrefixes(words, s);
        System.out.println(res);
    }
}
