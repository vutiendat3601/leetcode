package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00059SpiralMatrixII {

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];

        // input
        int l = 0, t = 0;
        int r = n - 1, b = n - 1;
        int i = 0, j = 0;

        boolean row = true;
        boolean lr = true;
        boolean td = false;

        while (i++ <= n * n) {
            int val = i;
            if (row) {
                // left to right
                if (lr && j <= r) {
                    res[t][j++] = val;
                    if (j > r) {
                        t++;
                        j = t;
                        td = true;
                        row = false;
                    }
                }
                // right to left
                else if (!lr && j >= l) {
                    res[b][j--] = val;
                    if (j < l) {
                        b--;
                        j = b;
                        td = false;
                        row = false;
                    }
                }
            } else {
                // top to down
                if (td && j <= b) {
                    res[j++][r] = val;
                    if (j > b) {
                        r--;
                        j = r;
                        lr = false;
                        row = true;
                    }
                }
                // down to top
                else if (!td && j >= t) {
                    res[j--][l] = val;
                    if (j < t) {
                        l++;
                        j = l; // ***
                        lr = true;
                        row = true;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] res = generateMatrix(n);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
