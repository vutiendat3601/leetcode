package tech.datvu.leetcode.general;

public class Leetcode_00026RemoveDuplicatesfromSortedArray {

    // So sanh vi tri sau so voi vi tri truoc,
    // Neu khac thi sao chep vao ngay sau vi tri truoc
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}
