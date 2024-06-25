/**
 * 162. Find Peak Element
 *
 * @link https://leetcode.com/problems/find-peak-element
 * @author vutiendat3601
 * @date 2024-06-25
 */
public class Leetcode00162 {
  public int findPeakElement(int[] nums) {
    final int n = nums.length;
    int k = 0;
    for (int step = n - 1; step >= 1; step /= 2) {
      while (k + step < n && nums[k + step - 1] < nums[k + step]) {
        k += step;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    final int[] nums = {1, 2, 1, 3, 5, 6, 4};

    final Leetcode00162 leetcode00162 = new Leetcode00162();
    final int index = leetcode00162.findPeakElement(nums);
    System.out.println("index: " + index);
  }
}
