package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01337TheKWeakestRowsinaMatrix {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] processRes = new int[mat.length];
        int[] res = new int[mat.length];
        int temp = 0;
        for (int i = 0; i < mat[0].length; i++) {
            if (mat[0][i] != 0) {
                temp++;
            } else {
                break;
            }
        }
        processRes[0] = temp;
        res[0] = 0;
        for (int i = 1; i < mat.length; i++) {
            temp = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 0) {
                    temp++;
                } else {
                    break;
                }
            }
            int l = i - 1;
            while (l >= 0 && temp < processRes[l]) {
                processRes[l + 1] = processRes[l];
                res[l + 1] = res[l];
                l--;
            }
            l++;
            processRes[l] = temp;
            res[l] = i;
        }
        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int k = 3;
        int[] res = kWeakestRows(mat, k);
        System.out.println(Arrays.toString(res));
    }
}
