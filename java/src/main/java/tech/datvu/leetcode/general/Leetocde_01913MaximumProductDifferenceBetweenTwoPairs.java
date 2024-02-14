package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetocde_01913MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {
        int[] twoMins = twoMin(nums);
        int[] twoMaxs = twoMax(nums);
        return twoMaxs[0] * twoMaxs[1] - twoMins[0] * twoMins[1];
    }

    public static int[] twoMin(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return new int[] { min1, min2 };
    }

    public static int[] twoMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }
        return new int[] { max1, max2 };
    }

    public static void main(String[] args) {
        int[] nums = { 1, 6, 7, 5, 2, 4, 10, 6, 4 };
        System.out.println(Arrays.toString(twoMin(nums)));
        int res = maxProductDifference(nums);
        System.out.println(res);
    }
}
