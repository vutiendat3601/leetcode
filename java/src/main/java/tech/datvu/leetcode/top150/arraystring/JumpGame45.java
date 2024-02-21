package tech.datvu.leetcode.top150.arraystring;

public class JumpGame45 {
    public int jump(int[] nums) {
        return jump(nums, 0);
    }

    private int jump(int[] nums, int posStart) {
        if (posStart + nums[posStart] >= nums.length - 1) {
            return 1;
        }
        int max = -1;
        int maxIndex = -1;
        for (int i = 1; i <= nums[posStart]; i++) {
            if (posStart + i + nums[posStart + i] > max) {
                max = posStart + i + nums[posStart + i];
                maxIndex = posStart + i;
            }
        }
        return jump(nums, maxIndex) + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3 };
        JumpGame45 jumpGame45 = new JumpGame45();
        int res = jumpGame45.jump(nums);
        System.out.println(res);
    }
}
