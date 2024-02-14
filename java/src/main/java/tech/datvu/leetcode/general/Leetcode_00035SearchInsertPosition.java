package tech.datvu.leetcode.general;

public class Leetcode_00035SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        // Neu phan tu thu i lon hon hoac bang target thi i chinh la vi tri can chen
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] >= target) {
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,5,6 };
        int target = 7;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }
}
