package tech.datvu.leetcode.general;

public class Leetcode_00643MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double res = sum * (1.0d) / k;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            res = res > sum * (1.0d) / k ? res : sum * (1.0d) / k;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double res = findMaxAverage(nums, k);
        System.out.println(res);
    }
}
