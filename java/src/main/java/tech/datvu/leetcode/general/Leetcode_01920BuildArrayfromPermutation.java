package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01920BuildArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));
    }
}
