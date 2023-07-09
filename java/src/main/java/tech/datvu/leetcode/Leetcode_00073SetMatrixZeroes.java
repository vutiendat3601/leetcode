package tech.datvu.leetcode;

public class Leetcode_00073SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        boolean[] fillRows = new boolean[matrix.length];
        boolean[] fillCols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    fillRows[i] = true;
                    fillCols[j] = true;
                }
            }
        }
        for (int i = 0; i < fillRows.length; i++) {
            if (fillRows[i]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < fillCols.length; i++) {
            if (fillCols[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix);
    }
}
