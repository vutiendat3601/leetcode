package tech.datvu.leetcode.general;

public class Leetcode_00240Searcha2DMatrixII {

    public static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return true;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {
            int midHeight = top + (bottom - top) / 2;
            int midWith = left + (right - left) / 2;
            if (matrix[midHeight][midWith] == target) {
                return true;
            }
            if (target < matrix[midHeight][midWith]) {
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16,
        // 22 }, { 10, 13, 14, 17, 24 },
        // { 18, 21, 23, 26, 30 } };
        // int target = 4;
        // boolean res = searchMatrix(matrix, target);
        // System.out.println(res);

        int[] nums = { 1, 2, 3, 4, 5, 6, 8, 9 };
        boolean res = binarySearch(nums, 1);
        System.out.println(res);
    }
}
