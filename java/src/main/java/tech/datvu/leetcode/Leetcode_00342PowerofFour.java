package tech.datvu.leetcode;

public class Leetcode_00342PowerofFour {

    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1 || n == 4) {
            return true;
        } else if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(32));
    }
}
