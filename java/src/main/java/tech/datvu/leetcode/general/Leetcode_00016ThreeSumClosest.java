package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00016ThreeSumClosest {
  public static int search(int[] nums, int value) {
    int begin = 0;
    int end = nums.length - 1;
    int index = (begin + end) / 2;
    while (begin < end) {
      index = (begin + end) / 2;
      if (nums[index] > value) {
        end = index - 1;
      } else if (nums[index] < value) {
        begin = index + 1;
      } else {
        break;
      }
    }
    return index;
  }

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int index = search(nums, target);
    final int leftMinSum = nums[index] + getSmallestSum(nums, 0, index - 1);
    final int rightMinSum = nums[index] + getSmallestSum(nums, index + 1, nums.length - 1);
    final int nearestSum = leftMinSum < rightMinSum ? leftMinSum : rightMinSum;
    return nearestSum;
  }

  private static int getSmallestSum(int[] nums, int begin, int end) {
    if (end <= begin) {
      return Integer.MAX_VALUE;
    }
    int smallestSum = nums[begin] + nums[end];
    while (begin < end) {
      int sum = nums[begin++] + nums[end--];
      smallestSum = smallestSum < sum ? smallestSum : sum;
    }
    return smallestSum;
  }

  public static void main(String[] args) {
    int[] nums = {4, 0, 5, -5, 3, 3, 0, -4, -5};
    int target = -2;
    int result = threeSumClosest(nums, target);

    System.out.println(result);
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
  }
}
