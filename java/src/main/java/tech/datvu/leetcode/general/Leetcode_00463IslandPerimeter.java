package tech.datvu.leetcode.general;

public class Leetcode_00463IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int res = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {

                    /* Tim tong so canh ngang */
                    if (r - 1 < 0 || grid[r - 1][c] == 0) {
                        res++;
                    }
                    if (r + 1 >= grid.length || grid[r + 1][c] == 0) {
                        res++;
                    }

                    /* Tim tong so canh doc */
                    if (c - 1 < 0 || grid[r][c - 1] == 0) {
                        res++;
                    }
                    if (c + 1 >= grid[r].length || grid[r][c + 1] == 0) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 0 } };
        int res = islandPerimeter(grid);
        System.out.println(res);
    }
}
