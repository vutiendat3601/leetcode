package tech.datvu.leetcode.general;

public class Leetcode_00594LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sameCnt = 0;
            int smallerCnt = 0;
            int biggerCnt = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    sameCnt++;
                } else if (nums[j] == nums[i] - 1) {
                    smallerCnt++;
                } else if (nums[j] == nums[i] + 1) {
                    biggerCnt++;
                }
            }

            int temp = smallerCnt > biggerCnt ? smallerCnt : biggerCnt;
            temp = temp == 0 ? 0 : temp + sameCnt;
            res = res > temp + 1 ? res : temp + 1;
        }
        return res == 1 ? 0 : res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3 };
        int res = findLHS(nums);
        System.out.println(res);
    }
}
