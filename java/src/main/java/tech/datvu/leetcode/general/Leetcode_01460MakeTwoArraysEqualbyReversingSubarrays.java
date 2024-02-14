package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01460MakeTwoArraysEqualbyReversingSubarrays {

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4 };
        int[] arr = { 2, 4, 1, 3 };
        boolean res = canBeEqual(target, arr);
        System.out.println(res);
    }
}
