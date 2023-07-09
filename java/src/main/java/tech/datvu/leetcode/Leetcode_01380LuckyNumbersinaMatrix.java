package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_01380LuckyNumbersinaMatrix {

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int minColumn = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][minColumn]) {
                    minColumn = j;
                }
            }
            temp[i] = minColumn;
        }
        for (int i = 0; i < temp.length; i++) {
            int maxRow = 0;
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[j][temp[i]] > matrix[maxRow][temp[i]]) {
                    maxRow = j;
                }
            }
            if (maxRow == i) {
                res.add(matrix[maxRow][temp[i]]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        List<Integer> res = luckyNumbers(matrix);
        System.out.println(res);
    }
}
