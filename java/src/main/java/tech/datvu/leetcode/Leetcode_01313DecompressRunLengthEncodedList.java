package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_01313DecompressRunLengthEncodedList {

    public static int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            n += nums[2 * i];
        }
        int[] res = new int[n];
        int cnt = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                res[cnt++] = nums[2 * i + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = decompressRLElist(nums);
        System.out.println(Arrays.toString(res));
    }
}
