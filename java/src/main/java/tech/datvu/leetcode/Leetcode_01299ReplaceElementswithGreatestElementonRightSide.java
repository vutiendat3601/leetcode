package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_01299ReplaceElementswithGreatestElementonRightSide {

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != max) {
                res[i] = max;
            } else {
                max = findMax(arr, i + 1);
                res[i] = max;
            }
        }
        res[arr.length - 1] = -1;
        return res;
    }

    public static int findMax(int[] nums, int index) {
        int max = nums[index];
        for (int i = index + 1; i < nums.length; i++) {
            max = max > nums[i] ? max : nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 17 };
        int[] res = replaceElements(arr);
        System.out.println(Arrays.toString(res));
    }
}
