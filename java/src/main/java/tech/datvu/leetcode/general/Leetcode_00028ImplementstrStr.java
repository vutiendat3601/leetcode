package tech.datvu.leetcode.general;

public class Leetcode_00028ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int res = -1;
        int cnt = 0;
        for (int i = 0; i < haystack.length(); i++) {
            int j = i;
            while (j < haystack.length() && haystack.charAt(j) == needle.charAt(cnt)) {
                res = i;
                cnt++;
                j++;
                if (cnt == needle.length()) {
                    return res;
                }
            }
            res = -1;
            cnt = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "aaaa";
        System.out.println(strStr(haystack, needle));
    }
}
