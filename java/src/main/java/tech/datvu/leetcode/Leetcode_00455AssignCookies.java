package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00455AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {

        int res = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length && s[j] < g[i]) {
                j++;
            }
            if (j < s.length) {
                res++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] s = { 1, 2, 3 };
        int[] g = { 1, 1 };
        int res = findContentChildren(g, s);
        System.out.println(res);
    }
}
