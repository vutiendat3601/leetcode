package tech.datvu.leetcode.general;

public class Leetcode_01779FindNearestPointThatHastheSameXorYCoordinate {

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int temp = manhattanDistance(x, y, points[i][0], points[i][1]);
                if (min > temp) {
                    min = temp;
                    res = i;
                }
            }
        }
        return res;
    }

    public static int manhattanDistance(int curX, int curY, int pointX, int pointY) {
        return Math.abs(curX - pointX) + Math.abs(curY - pointY);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = { { 1, 2 }, { 3, 1 }, { 2, 4 }, { 2, 3 }, { 4, 4 } };
        int res = nearestValidPoint(x, y, points);
        System.out.println(res);
    }
}
