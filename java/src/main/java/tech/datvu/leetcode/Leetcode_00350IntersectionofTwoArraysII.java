package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_00350IntersectionofTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] cnts = new int[1001];
        for (int i : nums1) {
            cnts[i]++;
        }
        List<Integer> intersects = new ArrayList<>();
        for (int i : nums2) {
            if (cnts[i] > 0) {
                intersects.add(i);
                cnts[i]--;
            }
        }
        int[] res = new int[intersects.size()];
        int k = 0;
        for (Integer i : intersects) {
            res[k++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        Arrays.sort(nums1);
        int[] res = intersect(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
