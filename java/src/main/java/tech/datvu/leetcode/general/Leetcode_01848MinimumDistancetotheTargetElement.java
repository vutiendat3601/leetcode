package tech.datvu.leetcode.general;

public class Leetcode_01848MinimumDistancetotheTargetElement {

    public static int getMinDistance(int[] nums, int target, int start) {
        int l = start;
        int r = start;
        while (l >= 0 && r < nums.length) {
            if (nums[l] == target || nums[r] == target) {
                return Math.abs(l - start);
            } else {
                l--;
                r++;
            }
        }
        while (l >= 0) {
            if (nums[l] == target) {
                return Math.abs(l - start);
            } else {
                l--;
            }
        }
        while (r < nums.length) {
            if (nums[r] == target) {
                return Math.abs(r - start);
            } else {
                r++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 6 };
        int target = 5;
        int start = 2;
        int res = getMinDistance(nums, target, start);
        System.out.println(res);
    }
}
