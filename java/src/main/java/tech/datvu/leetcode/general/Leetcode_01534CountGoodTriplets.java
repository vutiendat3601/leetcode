package tech.datvu.leetcode.general;

public class Leetcode_01534CountGoodTriplets {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int absIJ = Math.abs(arr[i] - arr[j]);
                    int absJK = Math.abs(arr[j] - arr[k]);
                    int absIK = Math.abs(arr[i] - arr[k]);
                    if (absIJ <= a && absJK <= b && absIK <= c) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7;
        int b = 2;
        int c = 3;
        int res = countGoodTriplets(arr, a, b, c);
        System.out.println(res);
    }
}
