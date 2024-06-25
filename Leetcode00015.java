import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 15. 3Sum
 *
 * @link https://leetcode.com/problems/3sum
 * @author vutiendat3601
 * @date 2024-06-20
 */
public class Leetcode00015 {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    final Set<List<Integer>> results = new HashSet<>();
    for (int i = 0; i < nums.length - 2; i++) {
      final int target = 0 - nums[i];
      final List<int[]> twoSums = twoSum(nums, target, i + 1, nums.length - 1);
      for (int[] twoSum : twoSums) {
        final List<Integer> result = new LinkedList<>();
        result.add(nums[i]);
        result.add(twoSum[0]);
        result.add(twoSum[1]);
        results.add(result);
      }
    }

    return new LinkedList<>(results);
  }

  private List<int[]> twoSum(int[] nums, int x, int begin, int end) {
    final List<int[]> result = new LinkedList<>();
    while (begin < end) {
      final int sum = nums[begin] + nums[end];
      if (sum == x) {
        result.add(new int[] {nums[begin], nums[end]});
        begin++;
        end--;
      } else if (sum > x) {
        end--;
      } else {
        begin++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    final int[] strs = {-2, 0, 1, 1, 2};

    final Leetcode00015 leetcode00015 = new Leetcode00015();
    final List<List<Integer>> threeSum = leetcode00015.threeSum(strs);
    System.out.println("threeSum: " + threeSum);
  }
}
