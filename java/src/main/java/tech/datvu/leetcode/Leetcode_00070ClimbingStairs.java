package tech.datvu.leetcode;

public class Leetcode_00070ClimbingStairs {

    public static int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }

        // numOfWays to level n is sum of numOfWays to level n - 1 and numOfWays to
        // level n - 2
        // because can next 1 or 2 level every step
        // start from 2
        int oneStepToN = 1;
        int twoStepToN = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = oneStepToN + twoStepToN;
            twoStepToN = oneStepToN;
            oneStepToN = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int res = climbStairs(n);
        System.out.println(res);
    }
}
