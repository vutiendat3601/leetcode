package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_02089FindTargetIndicesAfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        int cnt = 0;
        int lessCnt = 0;
        for (int i : nums) {
            if (i == target) {
                cnt++;
            } else if (i < target) {
                lessCnt++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = lessCnt; i < lessCnt + cnt; i++) {
            res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2, 3 };
        int target = 2;
        List<Integer> res = targetIndices(nums, target);
        System.out.println(res);
    }
}
