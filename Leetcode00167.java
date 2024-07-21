import java.util.Arrays;

/**
 * 167. Two Sum II - Input Array Is Sorted
 *
 * @link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
 * @author vutiendat3601
 * @date 2024-07-21
 */
public class Leetcode00167 {
  public int[] twoSum(int[] numbers, int target) {
    int begin = 0, end = numbers.length - 1;
    while (begin < end) {
      final int sum = numbers[begin] + numbers[end];
      if (sum == target) {
        return new int[] {begin + 1, end + 1};
      } else if (sum < target) {
        begin++;
      } else {
        end--;
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    final int[] numbers = {2, 7, 11, 15};
    final int target = 9;

    final Leetcode00167 leetcode00167 = new Leetcode00167();
    final int[] result = leetcode00167.twoSum(numbers, target);
    System.out.println(Arrays.toString(result));
  }
}
