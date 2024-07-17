import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1403. Minimum Subsequence in Non-Increasing Order
 *
 * @link https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order
 * @author vutiendat3601
 * @date 2024-07-17
 */
public class Leetcode01403 {
  public List<Integer> minSubsequence(int[] nums) {
    final int n = nums.length;
    Arrays.sort(nums);
    int[] prefixSums = new int[n];
    prefixSums[0] = nums[0];
    for (int i = 1; i < n; i++) {
      prefixSums[i] = nums[i] + prefixSums[i - 1];
    }
    int i = n - 1;
    while (i > 0) {
      int sum = getSum(prefixSums, i, n - 1);
      int prefixSum = prefixSums[i - 1];
      if (sum > prefixSum) {
        break;
      }
      i--;
    }
    List<Integer> result = new LinkedList<>();
    for (int j = n - 1; j >= i; j--) {
      result.add(nums[j]);
    }
    return result;
  }

  private int getSum(int[] sums, int begin, int end) {
    if (begin >= 1) {
      return sums[end] - sums[begin - 1];
    }
    return sums[end];
  }

  public static void main(String[] args) {
    final int[] nums = {8, 8};

    final Leetcode01403 leetcode01403 = new Leetcode01403();
    final List<Integer> result = leetcode01403.minSubsequence(nums);
    System.out.println(result);
  }
}
