package tech.datvu.leetcode.general;

public class Leetcode_00080RemoveDuplicatesfromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int n = nums.length;
        int i = 1;
        int cnt = 1;
        int res = 0;
        while (i < n) {
            if (cnt == 2) {
                while (nums[j] == nums[i]) {
                    remove(nums, n, i);
                    n--;
                    res++;
                }
                cnt = 0;
            } else if (nums[j] != nums[i]) {
                cnt = 0;
            }
            cnt++;
            j = i;
            i++;
        }
        return nums.length - res;
    }

    public static void remove(int[] nums, int n, int k) {
        for (int i = k; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int res = removeDuplicates(nums);
        System.out.println(res);
        // System.out.println(Arrays.toString(nums));
    }
}
