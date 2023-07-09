package tech.datvu.leetcode;

public class Leetcode_00027RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int cnt = 0;
        int i = -1;

        // Neu phan tu thu i khac voi val thi sao chep vao phan dau cua mang
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                nums[i] = nums[j];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println(res);
    }
}
