package tech.datvu.leetcode.general;

public class Leetcode_02176CountEqualandDivisiblePairsinanArray {

    public static int countPairs(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] && (i * j) % k == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 3,1,2,2,2,1,3 };
        int k = 2;
        System.out.println(countPairs(nums, k));
    }
}
