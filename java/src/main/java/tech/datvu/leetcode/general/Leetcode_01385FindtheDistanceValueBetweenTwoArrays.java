package tech.datvu.leetcode.general;

public class Leetcode_01385FindtheDistanceValueBetweenTwoArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            for (; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    break;
                }
            }
            res = j == arr2.length ? res + 1 : res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 8 };
        int[] arr2 = { 10, 9, 1, 8 };
        int d = 2;
        int res = findTheDistanceValue(arr1, arr2, d);
        System.out.println(res);
    }
}
