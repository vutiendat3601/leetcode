package tech.datvu.leetcode.general;

public class Leetcode_00525ContiguousArray {
    public static int findMaxLength(int[] nums) {
        int[] cnts = new int[2];
        for (int i : nums) {
            cnts[i]++;
        }
        return cnts[0] < cnts[1] ? cnts[0] * 2 : cnts[1] * 2;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 0, 1, 1, 1, 0 };
        int res = findMaxLength(nums);
        System.out.println(res);
    }
}
