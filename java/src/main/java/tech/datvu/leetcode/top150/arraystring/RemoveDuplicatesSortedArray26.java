package tech.datvu.leetcode.top150.arraystring;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {

    // ## Two-pointers technique
    public int removeDuplicates(int[] nums) {
        int j = 0, cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8 };
        RemoveDuplicatesSortedArray26 removeDuplicatesSortedArray26 = new RemoveDuplicatesSortedArray26();
        int res = removeDuplicatesSortedArray26.removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
