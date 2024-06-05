package tech.datvu.leetcode.general;

public class Leetcode_00560SubarraySumEqualsK {
  public static int subarraySum(int[] nums, int k) {
    int numOfSubArrays = 0;
    int begin = 0;
    int end = 0;
    int sum = nums[0];

    while (begin < nums.length && end < nums.length) {
      if (sum == k) {
        numOfSubArrays++;
        begin++;
        end++;
        sum -= nums[begin - 1];
        sum += end < nums.length ? nums[end] : 0;
      } else if (sum > k) {
        if (begin == end) {
          end++;
          sum += end < nums.length ? nums[end] : 0;
        }
        begin++;
        sum -= nums[begin - 1];
      } else if (sum < k) {
        end++;
        sum += end < nums.length ? nums[end] : 0;
      }
    }
    return numOfSubArrays;
  }

  public static void main(String[] args) {
    final int[] nums = {-1, -1, 1};
    final int k = 0;
    final int numOfSubArraySum = subarraySum(nums, k);
    System.out.println("numOfSubArraySum: " + numOfSubArraySum);
  }
}
