package tech.datvu.leetcode;

public class Leetcode_01413MinimumValuetoGetPositiveStepbyStepSum {

    public static int minStartValue(int[] nums) {
        int startValue = nums[0] < 0 ? 1 - nums[0] : 1;
        int curStartValue = startValue;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            curStartValue = curStartValue + nums[i];
            if (curStartValue < 1) {
                sum += 1 - curStartValue;
                curStartValue = 1;
            }
        }
        return startValue + sum;
    }

    public static void main(String[] args) {
        int[] nums = { -3, 2, -3, 4, 2 };
        int res = minStartValue(nums);
        System.out.println(res);
    }
}
