package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_01389CreateTargetArrayintheGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[nums.length];
        for (int i = 0; i < n; i++) {
            int k = n - 1;
            while (k > 0 && k != index[i]) {
                target[k] = target[k - 1];
                k--;
            }
            target[k] = nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }
}
