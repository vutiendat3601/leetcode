package tech.datvu.leetcode;

public class Leetcode_00136SingleNumber {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 4, 2 };
        System.out.println(singleNumber(nums));
    }
}
