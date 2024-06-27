/**
 * 33. Search in Rotated Sorted Array
 *
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array
 * @author vutiendat3601
 * @date 2024-06-25
 */
public class Leetcode00033 {
  public int search(int[] nums, int target) {
    int begin = 0;
    int end = nums.length - 1;
    while (begin <= end) {
      int mid = (begin + end) / 2;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[begin] == target) {
        return begin;
      }
      if (nums[end] == target) {
        return end;
      }
      if (nums[mid] > nums[begin]) {
        if (nums[begin] < target && target < nums[mid]) {
          begin++;
          end = mid - 1;
        } else {
          begin = mid + 1;
          end--;
        }
      } else {
        if (nums[mid] < target && target < nums[end]) {
          begin = mid + 1;
          end--;
        } else {
          begin++;
          end = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    final int nums[] = {5, 1, 3};
    final int target = 5;

    final Leetcode00033 leetcode00033 = new Leetcode00033();
    final int result = leetcode00033.search(nums, target);
    System.out.println("result: " + result);
  }
}
