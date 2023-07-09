package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00566ReshapetheMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat[0].length * mat.length) {
            return mat;
        }
        int[][] res = new int[r][c];
        int iR = 0;
        int jR = 0;
        for (int[] i : mat) {
            for (int j : i) {
                if (jR == c) {
                    iR++;
                    jR = 0;
                }
                res[iR][jR++] = j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 2;
        int c = 4;
        int[][] res = matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
