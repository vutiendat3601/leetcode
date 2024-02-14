package tech.datvu.leetcode.general;

public class Leetcode_01822SignoftheProductofanArray {

    public static int arraySign(int[] nums) {
        int negativeCnt = 0;
        for (int i : nums) {
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                negativeCnt++;
            }
        }
        return (negativeCnt & 1) == 0 ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, -2, -3, -4, 3, 2, 1 };
        int res = arraySign(nums);
        System.out.println(res);
    }
}
