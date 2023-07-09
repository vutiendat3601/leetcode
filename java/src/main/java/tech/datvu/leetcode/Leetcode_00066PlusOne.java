package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00066PlusOne {
    public static int[] plusOne(int[] digits) {

        // Neu so cuoi be hon 9, tang them 1 va tra ve ket qua
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        // Xu ly truong hop so cuoi cung lon hon hoac bang 9
        int i = digits.length - 1;
        while (i >= 0 && digits[i] + 1 > 9) {
            digits[i] = 0;
            i--;
        }
        if (i < 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        digits[i]++;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[] { 1, 2, 3, 9 };
        int[] res = plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
