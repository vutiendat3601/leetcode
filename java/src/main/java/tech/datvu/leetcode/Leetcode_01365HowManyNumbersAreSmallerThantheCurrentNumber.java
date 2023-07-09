package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_01365HowManyNumbersAreSmallerThantheCurrentNumber {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cnts = new int[101];

        // Dem so luong tung phan tu
        for (int i : nums) {
            cnts[i]++;
        }

        int sum = 0;

        // dem cac vi tri ton tai truoc vi tri hien tai
        for (int i = 0; i < cnts.length; i++) {
            int temp = cnts[i];
            cnts[i] = sum;
            sum += temp;
        }

        // Tra ve ket qua
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = cnts[nums[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
}
