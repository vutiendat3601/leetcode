package tech.datvu.leetcode.general;

public class Leetcode_00598RangeAdditionII {
    public static int maxCount(int m, int n, int[][] ops) {
        int[] maxArea = { m, n };
        for (int i = 0; i < ops.length; i++) {
            maxArea[0] = Math.min(maxArea[0], ops[i][0]);
            maxArea[1] = Math.min(maxArea[1], ops[i][1]);
            if (maxArea[0] * maxArea[1] == 1)
                return 1; // if area became 1,it can't shrink more, so return 1
        }
        return maxArea[0] * maxArea[1];
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] ops = { { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 } };
        int res = maxCount(m, n, ops);
        System.out.println(res);
    }
}
