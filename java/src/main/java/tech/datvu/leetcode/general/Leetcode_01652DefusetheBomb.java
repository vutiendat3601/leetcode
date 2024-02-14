package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01652DefusetheBomb {

    public static int[] decrypt(int[] code, int k) {
        int[] target = new int[code.length];
        if (k >= 0) {
            for (int i = 0; i < target.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    if (i + j < target.length) {
                        sum += code[i + j];
                    } else {
                        sum += code[i + j - code.length];
                    }
                }
                target[i] = sum;
            }
        } else {
            for (int i = 0; i < target.length; i++) {
                int sum = 0;
                for (int j = 1; j <= -k; j++) {
                    if (i - j >= 0) {
                        sum += code[i - j];
                    } else {
                        sum += code[code.length + i - j];
                    }
                }
                target[i] = sum;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] code = { 2, 4, 9, 3 };
        int k = -2;
        int[] res = decrypt(code, k);
        System.out.println(Arrays.toString(res));
    }
}
