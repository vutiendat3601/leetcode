package tech.datvu.leetcode;

public class Leetcode_00485MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                res = res > cnt ? res : cnt;
                cnt = 0;
            }
        }

        // Neu ket qua nam o cuoi mang
        res = res > cnt ? res : cnt;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int res = findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
}
