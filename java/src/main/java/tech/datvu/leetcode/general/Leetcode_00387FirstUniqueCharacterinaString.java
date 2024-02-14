package tech.datvu.leetcode.general;

public class Leetcode_00387FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        int[] charCounts = new int[255];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
        }
        int res = 0;
        while (res < s.length() && charCounts[s.charAt(res)] > 1) {
            res++;
        }
        return res == s.length() ? -1 : res;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
