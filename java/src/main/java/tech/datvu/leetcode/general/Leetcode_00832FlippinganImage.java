package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00832FlippinganImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for (int j = image[i].length - 1; j >= 0; j--) {
                res[i][k++] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] res = flipAndInvertImage(image);
        for (int[] i : res) {
            System.out.println(Arrays.toString(i));
        }
    }
}
