package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_01619MeanofArrayAfterRemovingSomeElements {
    public static double trimMean(int[] arr) {
        int rmCnt = (int) (arr.length * 0.05f);
        Arrays.sort(arr);
        int sum = 0;
        for (int i = rmCnt; i < arr.length - rmCnt; i++) {
            sum += arr[i];
        }
        double res = (sum * (1.0d)) / (double) (arr.length - 2 * rmCnt);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6,
                1, 0, 6, 10, 8, 2, 3, 4 };
        double res = trimMean(arr);
        System.out.println(res);
    }
}
