package tech.datvu.leetcode.general;

public class Leetcode_01464MaximumProductofTwoElementsinanArray {
    public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 5 };
        int res = maxProduct(nums);
        System.out.println(res);
    }
}
