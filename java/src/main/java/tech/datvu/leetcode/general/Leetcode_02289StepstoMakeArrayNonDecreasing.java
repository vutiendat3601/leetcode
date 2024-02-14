package tech.datvu.leetcode.general;

import java.util.Stack;

public class Leetcode_02289StepstoMakeArrayNonDecreasing {

    public static int totalSteps(int[] nums) {
        Stack<int[]> s = new Stack<>();
        int res = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                s.push(new int[] { nums[i], 0 });
            } else {
                int cnt = 0;
                while (!s.isEmpty() && s.peek()[0] < nums[i]) {
                    cnt = Math.max(cnt + 1, s.peek()[1]);
                    s.pop();
                }
                res = Math.max(cnt, res);
                s.push(new int[] { nums[i], cnt });
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11 };
        int res = totalSteps(nums);
        System.out.println(res);
    }
}
