package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00496NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int[] mark = new int[10001];
        for (int i = 0; i < nums2.length; i++) {
            int j = i + 1;
            while (j < nums2.length && nums2[j] < nums2[i]) {
                j++;
            }
            if (j >= nums2.length) {
                mark[nums2[i]] = -1;
            } else {
                mark[nums2[i]] = nums2[j];
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = mark[nums1[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 4 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] res = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
