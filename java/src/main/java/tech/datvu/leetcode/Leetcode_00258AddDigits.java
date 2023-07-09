package tech.datvu.leetcode;

public class Leetcode_00258AddDigits {

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        num = sumDigits(num);
        return addDigits(num);
    }

    private static int sumDigits(int num) {
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 0;
        int res = addDigits(num);
        System.out.println(res);
    }
}