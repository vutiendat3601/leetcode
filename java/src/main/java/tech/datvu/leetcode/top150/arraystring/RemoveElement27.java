package tech.datvu.leetcode.top150.arraystring;

import java.util.Arrays;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int cnt = nums.length;
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                nums[i] = nums[j];
            } else {
                cnt--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int val = 1;
        RemoveElement27 removeElement27 = new RemoveElement27();
        int res = removeElement27.removeElement(nums, val);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
