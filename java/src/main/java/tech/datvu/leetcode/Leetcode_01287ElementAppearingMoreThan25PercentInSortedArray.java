package tech.datvu.leetcode;

public class Leetcode_01287ElementAppearingMoreThan25PercentInSortedArray {

    public static int findSpecialInteger(int[] arr) {
        int[] cnts = new int[100001];
        for (int i : arr) {
            cnts[i]++;
        }

        for (int i : arr) {
            if (cnts[i] * 1.0f / arr.length > 0.25f) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        int res = findSpecialInteger(arr);
        System.out.println(res);
    }
}
