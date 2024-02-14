package tech.datvu.leetcode.general;

public class Leetcode_02185CountingWordsWithaGivenPrefix {
    public static int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String i : words) {
            if (i.startsWith(pref)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "pay", "attention", "practice", "attend" };
        String pref = "at";
        int res = prefixCount(words, pref);
        System.out.println(res);
    }
}