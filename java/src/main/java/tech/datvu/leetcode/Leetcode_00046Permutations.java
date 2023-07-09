package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00046Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        return helper(nums, 0);
    }

    public static List<List<Integer>> helper(int[] nums, int idx) {
        List<List<Integer>> res = new ArrayList<>();
        if (idx == nums.length - 1) {
            List<Integer> l = new ArrayList<>();
            l.add(nums[idx]);
            res.add(l);
            return res;
        }
        List<List<Integer>> tempRes = helper(nums, idx + 1);
        for (List<Integer> e : tempRes) {
            int l = e.size();
            for (int i = 0; i <= l; i++) {
                List<Integer> copy = new ArrayList<>(e);
                copy.add(i, nums[idx]);
                res.add(copy);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }
}
