package tech.datvu.leetcode.general;

public class Leetcode_01725NumberOfRectanglesThatCanFormTheLargestSquare {
    public static int countGoodRectangles(int[][] rectangles) {

        int res = 0;
        int max = 0;

        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (rectangles[i][0] < rectangles[i][1]) {
                    max = max > rectangles[i][0] ? max : rectangles[i][0];
                } else {
                    max = max > rectangles[i][1] ? max : rectangles[i][1];
                }
            }
        }

        for (int i = 0; i < rectangles.length; i++) {
            res = max <= rectangles[i][0] && max <= rectangles[i][1] ? res + 1 : res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] rectangles = { { 2, 3 }, { 3, 7 }, { 4, 3 }, { 3, 7 } };
        int res = countGoodRectangles(rectangles);
        System.out.println(res);
    }
}
