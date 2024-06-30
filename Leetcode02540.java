/**
 * 2540. Minimum Common Value
 *
 * @link https://leetcode.com/problems/minimum-common-value
 * @author vutiendat3601
 * @date 2024-06-30
 */
public class Leetcode02540 {
  public int getCommon(int[] nums1, int[] nums2) {
    final int n1 = nums1.length;
    final int n2 = nums2.length;
    int i1 = 0;
    int i2 = 0;
    while (i1 < n1 && i2 < n2) {
      if (nums1[i1] == nums2[i2]) {
        return nums1[i1];
      } else if (nums1[i1] < nums2[i2]) {
        i1++;
      } else {
        i2++;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    final int[] nums1 = {1, 2, 3, 6};
    final int[] nums2 = {2, 3, 4, 5};

    final Leetcode02540 leetcode02540 = new Leetcode02540();
    final int smallestCommon = leetcode02540.getCommon(nums1, nums2);
    System.out.println("smallestCommon: " + smallestCommon);
  }
}
