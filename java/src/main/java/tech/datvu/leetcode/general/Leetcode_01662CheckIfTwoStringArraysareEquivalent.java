package tech.datvu.leetcode.general;

public class Leetcode_01662CheckIfTwoStringArraysareEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String s : word1) {
            s1.append(s);
        }
        for (String s : word2) {
            s2.append(s);
        }
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String[] words1 = { "ab", "c" };
        String[] words2 = { "a", "bc" };
        boolean res = arrayStringsAreEqual(words1, words2);
        System.out.println(res);
    }
}
