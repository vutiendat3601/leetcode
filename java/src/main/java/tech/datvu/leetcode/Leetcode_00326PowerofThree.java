package tech.datvu.leetcode;

public class Leetcode_00326PowerofThree {

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1 || n == 3) {
            return true;
        } else if (n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
        System.out.println(isPowerOfThree(81));
    }
}
