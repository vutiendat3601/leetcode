/**
 * 154. Find Minimum in Rotated Sorted Array II
 *
 * @link https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii
 * @author vutiendat3601
 * @date 2024-06-25
 */
public class Leetcode00154 {
  public int findMin(int[] nums) {
    final int n = nums.length;
    int k = -1;
    for (int step = n; step >= 1; step /= 2) {
      while (k + step < n && nums[k + step] > nums[0]) {
        k += step;
      }
    }
    while (k + 1 < n && nums[k + 1] >= nums[0]) {
      k++;
    }
    return k + 1 < n ? nums[k + 1] : nums[0];
  }

  public static void main(String[] args) {
    final int[] nums = {1, 2, 1};

    final Leetcode00154 leetcode00154 = new Leetcode00154();
    final int min = leetcode00154.findMin(nums);
    System.out.println("min: " + min);
  }
}
