package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00078Subsets {

    private static int[] indices = new int[11];

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i <= nums.length; i++) {
            indices[0] = -1;
            subsets(nums, res, i, 1);
        }
        return res;
    }

    public static void subsets(int[] nums, List<List<Integer>> res, int n, int iTh) {
        for (int i = indices[iTh - 1] + 1; i < nums.length; i++) {
            indices[iTh] = i;
            if (iTh == n) {
                List<Integer> temp = new ArrayList<>();
                for (int k = 1; k <= n; k++) {
                    temp.add(nums[indices[k]]);
                }
                res.add(temp);
            } else {
                subsets(nums, res, n, iTh + 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = subsets(nums);
        res.forEach(e -> {
            System.out.println(e);
        });
    }
}