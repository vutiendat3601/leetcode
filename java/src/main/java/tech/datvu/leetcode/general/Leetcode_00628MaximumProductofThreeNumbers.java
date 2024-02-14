package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00628MaximumProductofThreeNumbers {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int option1 = nums[n - 3] * nums[n - 2] * nums[n - 1];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int res = maximumProduct(nums);
        System.out.println(res);
    }
}
