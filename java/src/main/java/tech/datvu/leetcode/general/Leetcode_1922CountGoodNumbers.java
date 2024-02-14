package tech.datvu.leetcode.general;

public class Leetcode_1922CountGoodNumbers {

    private static int MODULO = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long totalE = pow(5L, (n + 1) / 2);
        long totalO = pow(4L, n / 2);
        return (int) ((totalE * totalO) % MODULO);
    }

    public static long pow(long x, long n) {
        if (n == 0) {
            return 1 & MODULO;
        } else if (n == 1) {
            return x & MODULO;
        }
        long res = pow(x, n / 2);
        if ((n & 1) > 0) {
            return x * res * res % MODULO;
        }
        return res * res % MODULO;
    }

    public static long power(long x, long n) {
        long res = 1;
        int[] evens = new int[(int) n / 2];
        int i = 0;
        while (n >= 1) {
            if ((n & 1) == 0) {
                evens[i] = 1;
            }
            n /= 2;
            i++;
        }
        for (i = i - 1; i >= 0; i--) {
            if ((i & 1) == 0) {
                res = res * res;
            } else {
                res = res * res * x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 9));
        // System.out.println(countGoodNumbers(50));
    }
}
