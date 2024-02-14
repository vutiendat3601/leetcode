package tech.datvu.leetcode.general;

public class Leetcode_00009PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int tmp = 0;
        while (x > 0) {
            tmp=tmp*10+x%10;
            x/=10;
        }
        return tmp == original;
    }
}
