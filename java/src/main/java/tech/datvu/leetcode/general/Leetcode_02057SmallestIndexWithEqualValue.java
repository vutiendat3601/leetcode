package tech.datvu.leetcode.general;

public class Leetcode_02057SmallestIndexWithEqualValue {

    public static int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,1 };
        int res = smallestEqual(nums);
        System.out.println(res);
    }
}
