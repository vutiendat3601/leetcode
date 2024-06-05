package tech.datvu.leetcode.general;

public class Leetcode_00300LongestIncreasingSubsequence {
  public static int lengthOfLIS(int[] nums) {
    final int[] MAX_LENS = new int[nums.length];
    MAX_LENS[0] = 1;
    int maxIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      MAX_LENS[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          MAX_LENS[i] = Math.max(MAX_LENS[i], MAX_LENS[j] + 1);
        }
      }
      maxIndex = MAX_LENS[maxIndex] > MAX_LENS[i] ? maxIndex : i;
    }
    return MAX_LENS[maxIndex];
  }

  public static void main(String[] args) {
    int[] nums = {1, 3, 6, 7, 9, 4, 10, 5, 6};
    int res = lengthOfLIS(nums);
    System.out.println(res);
  }
}
