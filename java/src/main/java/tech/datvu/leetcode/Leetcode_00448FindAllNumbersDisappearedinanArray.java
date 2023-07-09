package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00448FindAllNumbersDisappearedinanArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] cnt = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]]++;
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (cnt[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> res = findDisappearedNumbers(nums);
        res.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
