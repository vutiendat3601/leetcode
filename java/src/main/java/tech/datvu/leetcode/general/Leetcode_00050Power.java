package tech.datvu.leetcode.general;

public class Leetcode_00050Power {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        double temp = 0;
        if (n > 1) {
            temp = myPow(x, n / 2);
            temp *= temp;
            if ((n & 1) > 0) {
                temp *= x;
            }
        } else if (n < 0) {
            temp = myPow(x, -(n / 2));
            temp *= temp;
            if ((-n & 1) > 0) {
                temp *= x;
            }
            temp = 1.0d / temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(myPow(1d, -2147483648));

    }
}
