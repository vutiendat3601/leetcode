package tech.datvu.leetcode.general;

public class Leetcode_02108FindFirstPalindromicStringintheArray {
    public static String firstPalindrome(String[] words) {
        for (String s : words) {
            if (isPalindromic(s)) {
                return s;
            }
        }
        return "";
    }

    public static boolean isPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        String res = firstPalindrome(words);
        System.out.println(res);
    }
}
