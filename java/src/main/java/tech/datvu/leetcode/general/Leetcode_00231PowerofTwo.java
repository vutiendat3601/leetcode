package tech.datvu.leetcode.general;

public class Leetcode_00231PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if ((n & 1) != 0) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        return isPowerOfTwo(n >> 1);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(7));
    }
}
