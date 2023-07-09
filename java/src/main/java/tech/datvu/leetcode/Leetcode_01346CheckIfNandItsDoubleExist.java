package tech.datvu.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_01346CheckIfNandItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> exists = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (((arr[i] & 1) == 0 && exists.contains(arr[i] / 2)) || exists.contains(arr[i] * 2)) {
                return true;
            } else {
                exists.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        boolean res = checkIfExist(arr);
        System.out.println(res);
    }
}
