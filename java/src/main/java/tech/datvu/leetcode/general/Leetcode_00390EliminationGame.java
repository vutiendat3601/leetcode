package tech.datvu.leetcode.general;

public class Leetcode_00390EliminationGame {

    public static int lastRemaining(int n) {
        if (n == 1)
            return n;
        int x = lastRemaining(n / 2);
        return (n / 2 - x + 1) * 2;
    }

    public static void main(String[] args) {
        int n = 14;
        int res = lastRemaining(n);
        System.out.println(res);
    }
}
