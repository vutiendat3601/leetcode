package tech.datvu.leetcode;

public class Leetcode_00069Sqrt {
    public static int mySqrt(int x) {
        int i = 1;
        while ((long) i * i <= x / 2 + 1) {
            i++;
        }
        return (int) i - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
