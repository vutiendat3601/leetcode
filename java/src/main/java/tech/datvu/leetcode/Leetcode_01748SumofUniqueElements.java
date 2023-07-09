package tech.datvu.leetcode;

public class Leetcode_01748SumofUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int res = 0;
        int[] cnts = new int[101];

        for (int i = 0; i < nums.length; i++) {
            cnts[nums[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (cnts[nums[i]] == 1) {
                res += nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2 };
        int res = sumOfUnique(nums);
        System.out.println(res);
    }
}
