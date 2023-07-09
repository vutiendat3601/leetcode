package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00048RotateImage {
    public static void swap(int[][] arr, int fI, int fJ, int sI, int sJ) {
        int temp = arr[fI][fJ];
        arr[fI][fJ] = arr[sI][sJ];
        arr[sI][sJ] = temp;
    }

    public static void rotate(int[][] matrix) {
        int aLeft = 0;
        int aRight = matrix[0].length - 1;
        int aTop = matrix.length - 1;
        int aBottom = 0;
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        while (left < right && top < bottom) {
            aLeft = left;
            aBottom = bottom;
            aRight = right;
            aTop = top;
            while (aLeft < right) {
                swap(matrix, top, aLeft, aBottom, left);
                swap(matrix, aBottom, left, bottom, aRight);
                swap(matrix, bottom, aRight, aTop, right);
                aLeft++;
                aBottom--;
                aRight--;
                aTop++;
            }
            left++;
            right--;
            bottom--;
            top++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
