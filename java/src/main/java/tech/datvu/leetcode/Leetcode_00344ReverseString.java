package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00344ReverseString {

    public static void reverseString(char[] s) {
        reverseString(s, 0, s.length - 1);
    }

    public static void reverseString(char[] s, int l, int r) {
        if (l >= r) {
            return;
        }
        char c = s[l];
        s[l] = s[r];
        s[r] = c;
        reverseString(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
