package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_1929ConcatenationofArray {
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = res[i + nums.length] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[] { 1, 3, 2, 1 })));
    }
}
