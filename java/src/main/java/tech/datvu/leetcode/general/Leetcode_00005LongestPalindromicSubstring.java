package tech.datvu.leetcode.general;

public class Leetcode_00005LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        String res = s.substring(0, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                int start = j;
                int end = j + i;
                dp[start][end] = s.charAt(start) == s.charAt(end);
                if (dp[start][end] && start + 1 <= end - 1) {
                    dp[start][end] = dp[start][end] && dp[start + 1][end - 1];
                }
                if (dp[start][end]) {
                    res = s.substring(start, end + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(longestPalindrome(s));
    }
}
