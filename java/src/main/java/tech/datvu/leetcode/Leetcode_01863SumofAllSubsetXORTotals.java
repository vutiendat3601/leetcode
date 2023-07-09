package tech.datvu.leetcode;

public class Leetcode_01863SumofAllSubsetXORTotals {

    public static int subsetXORSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return subsetXORSum(nums, 0, 0);
    }

    public static int subsetXORSum(int[] nums, int iTh, int xorVal) {
        if (iTh == nums.length) {
            return xorVal;
        }
        int in = subsetXORSum(nums, iTh + 1, xorVal ^ nums[iTh]);
        int ou = subsetXORSum(nums, iTh + 1, xorVal);
        return in + ou;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(subsetXORSum(nums));
    }
}
