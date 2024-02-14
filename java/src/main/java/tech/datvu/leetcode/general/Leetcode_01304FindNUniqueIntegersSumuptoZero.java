package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01304FindNUniqueIntegersSumuptoZero {

    public static int[] sumZero(int n) {
        int[] res = new int[n];
        int j = 1;
        for (int i = 1; i < n; i += 2) {
            res[i - 1] = -j;
            res[i] = j;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] res = sumZero(n);
        System.out.println(Arrays.toString(res));
    }
}
