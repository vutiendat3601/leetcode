package tech.datvu.leetcode.general;

public class Leetcode_02352EqualRowandColumnPairs {

    public static int equalPairs(int[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int k = 0;
                for (; k < grid[i].length; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        break;
                    }
                }
                if (k >= grid[i].length) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        int res = equalPairs(grid);
        System.out.println(res);
    }
}