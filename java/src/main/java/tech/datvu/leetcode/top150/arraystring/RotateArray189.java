package tech.datvu.leetcode.top150.arraystring;

import java.util.Arrays;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    private void reverse(int[] nums, int from, int to) {
        int offset = to - from;
        int mid = offset / 2;
        for (int i = 0; i < mid; i++) {
            int temp = nums[from + i];
            nums[from + i] = nums[to - 1 - i];
            nums[to - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 2;
        RotateArray189 rotateArray189 = new RotateArray189();
        rotateArray189.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
