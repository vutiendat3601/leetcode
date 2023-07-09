package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00034FindFirstandLastPositionofElementinSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[] { -1, -1 };

        // Find left
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == target) {
                res[0] = res[1] = i;
                break;
            }
        }
        for (int j = nums.length - 1; j > i; j--) {
            if (nums[j] == target) {
                res[1] = j;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
