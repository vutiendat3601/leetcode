package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00942DIStringMatch {
    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int i = 0;
        int j = s.length();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (c == 'D') {
                res[k] = j--;
            } else {
                res[k] = i++;
            }
            k++;
        }
        res[k] = i;
        return res;
    }

    public static void main(String[] args) {
        String s = "III";
        int[] res = diStringMatch(s);
        System.out.println(Arrays.toString(res));
    }
}
