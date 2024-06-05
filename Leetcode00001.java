import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * @link https://leetcode.com/problems/two-sum/description
 * @author vutiendat3601
 * @date 2024-06-06
 */
public class Leetcode00001 {
  public int[] twoSum(int[] nums, int target) {
    final Map<Integer, Integer> numsIndexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      // Use "numsIndexMap" to store the index of number in the "nums" for the last access to it
      if (numsIndexMap.containsKey(target - nums[i])) {
        return new int[] {numsIndexMap.get(target - nums[i]), i};
      } else {
        numsIndexMap.put(nums[i], i);
      }
    }
    return null;
  }

  public static void main(String[] args) {
    final int[] nums = {3, 3};
    final int target = 6;

    final Leetcode00001 leetcode00001 = new Leetcode00001();
    final int[] twoSum = leetcode00001.twoSum(nums, target);
    System.out.println(Arrays.toString(twoSum));
  }
}
