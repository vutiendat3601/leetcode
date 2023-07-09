package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_02215FindtheDifferenceofTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> sNums1 = new HashSet<>();
        Set<Integer> sNums2 = new HashSet<>();

        for (int i : nums1) {
            sNums1.add(i);
        }

        for (int i : nums2) {
            sNums2.add(i);
        }

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for (int i : nums1) {
            if (!res1.contains(i) && !sNums2.contains(i)) {
                res1.add(i);
            }
        }

        for (int i : nums2) {
            if (!res2.contains(i) && !sNums1.contains(i)) {
                res2.add(i);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        List<List<Integer>> res = findDifference(nums1, nums2);
        res.forEach(o -> {
            System.out.println(o);
        });
    }
}
