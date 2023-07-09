package tech.datvu.leetcode;

public class Leetcode_01684CounttheNumberofConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for (String i : words) {
            int j = 0;
            while (j < i.length()) {
                if (!allowed.contains(i.substring(j, j + 1))) {
                    break;
                }
                j++;
            }
            if (j == i.length()) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int res = countConsistentStrings(allowed, words);
        System.out.println(res);
    }
}
