package tech.datvu.leetcode.general;

public class Leetcode_01351CountNegativeNumbersinaSortedMatrix {

    public static int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int[] i : grid) {
            for (int j : i) {
                if (j < 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        int res = countNegatives(grid);
        System.out.println(res);
    }
}