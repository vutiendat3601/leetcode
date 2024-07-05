/**
 * 153. Find Minimum in Rotated Sorted Array
 *
 * @link https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 * @author vutiendat3601
 * @date 2024-06-25
 */
public class Leetcode00153 {
  public int findMin(int[] nums) {
    int n = nums.length;
    int begin = 0;
    int end = n - 1;
    int ans = 0;
    while (begin <= end) {
      int mid = begin + (end - begin) / 2;
      if (nums[mid] > nums[n - 1]) {
        begin = mid + 1;
      } else {
        ans = mid;
        end = mid - 1;
      }
    }

    return nums[ans];
  }

  public static void main(String[] args) {
    final int[] nums = {2, 1};

    final Leetcode00153 leetcode00153 = new Leetcode00153();
    final int min = leetcode00153.findMin(nums);
    System.out.println("min: " + min);
  }
}
