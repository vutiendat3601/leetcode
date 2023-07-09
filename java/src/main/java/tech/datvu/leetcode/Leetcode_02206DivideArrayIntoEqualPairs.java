package tech.datvu.leetcode;

public class Leetcode_02206DivideArrayIntoEqualPairs {
    public static boolean divideArray(int[] nums) {
        int[] cnt = new int[501];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if ((cnt[i] & 1) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,19,10,9,12,2,12,3,3,11,5,8,4,13,6,2,11,9,19,11,15,9,17,15,12,5,14,12,16,18,16,10,3,8,9,16,20,2,4,16,12,11,14,20,16,2,18,17,20,3,13,16,17,1,1,11,20,20,4};
        System.out.println(divideArray(nums));
    }
}
