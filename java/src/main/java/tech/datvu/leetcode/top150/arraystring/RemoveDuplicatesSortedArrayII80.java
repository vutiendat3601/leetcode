package tech.datvu.leetcode.top150.arraystring;

import java.util.Arrays;

public class RemoveDuplicatesSortedArrayII80 {

    public int removeDuplicates(int[] nums) {
        int uniqueCnt = 1;
        int j = 0, i = 1, k = 0;
        while (i < nums.length) {

            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i++];
            } else {
                j++;
                nums[j] = nums[i];
                k = i + 1;
                while (k < nums.length && nums[k] == nums[j]) {
                    nums[k] = nums[j];
                    k++;
                }
                i = k;
            }
            uniqueCnt++;
        }
        return uniqueCnt;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        RemoveDuplicatesSortedArrayII80 removeDuplicatesSortedArrayII80 = new RemoveDuplicatesSortedArrayII80();
        int res = removeDuplicatesSortedArrayII80.removeDuplicates(nums);
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
