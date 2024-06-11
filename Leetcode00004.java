/**
 * 4. Median of Two Sorted Arrays
 *
 * @link https://leetcode.com/problems/median-of-two-sorted-arrays
 * @author vutiendat3601
 * @date 2024-06-11
 */
public class Leetcode00004 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int numOfElements = nums1.length + nums2.length;
    int beginNums1 = 0;
    int endNums1 = nums1.length - 1;
    int beginNums2 = 0;
    int endNums2 = nums2.length - 1;

    // Eliminate two elements the biggest and the smallest number every loop until there is only one
    // or two numbers
    while (numOfElements > 2) {
      if (beginNums1 > endNums1) { // When the nums1 array is empty
        beginNums2++;
        endNums2--;
      } else if (beginNums2 > endNums2) { // When the nums2 array is empty
        beginNums1++;
        endNums1--;
      } else { // When two arrays have elements
        if (nums1[beginNums1] <= nums2[beginNums2]) {
          beginNums1++;
        } else {
          beginNums2++;
        }
        if (nums1[endNums1] >= nums2[endNums2]) {
          endNums1--;
        } else {
          endNums2--;
        }
      }
      numOfElements -= 2;
    }
    if (beginNums1 > endNums1) {
      return (nums2[beginNums2] + nums2[endNums2]) / 2;
    }
    if (beginNums2 > endNums2) {
      return (nums1[beginNums1] + nums1[endNums1]) / 2;
    }
    return (nums1[beginNums1] + nums2[beginNums2]) / 2.0F;
  }

  public static void main(String[] args) {
    final int[] nums1 = {1, 2};
    final int[] nums2 = {3, 4};

    final Leetcode00004 leetcode00004 = new Leetcode00004();
    final double median = leetcode00004.findMedianSortedArrays(nums1, nums2);
    System.out.println("median: " + median);
  }
}
