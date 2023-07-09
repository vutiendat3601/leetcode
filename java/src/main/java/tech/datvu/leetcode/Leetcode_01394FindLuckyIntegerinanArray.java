package tech.datvu.leetcode;

public class Leetcode_01394FindLuckyIntegerinanArray {
    public static int findLucky(int[] arr) {
        int[] cnts = new int[501];
        for (int i = 0; i < arr.length; i++) {
            cnts[arr[i]]++;
        }

        for (int i = 500;i>0;i--) {
            if (cnts[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,2,3,3,3 };
        int res = findLucky(arr);
        System.out.println(res);
    }
}
