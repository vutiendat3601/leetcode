package tech.datvu.leetcode;

public class Leetcode_01909RemoveOneElementtoMaketheArrayStrictlyIncreasing {

    public static boolean canBeIncreasing(int[] nums) {
        if (nums.length < 3) {
            return true;
        }

        int cnt = 0;
        int cmp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= cmp) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i == 1 || nums[i] > nums[i - 2]) {
                    cmp = nums[i];
                }
            } else {
                cmp = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 21, 100 };
        boolean res = canBeIncreasing(nums);
        System.out.println(res);
    }
}
