package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00349IntersectionofTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        boolean[] exist = new boolean[1001];

        for (int i = 0; i < nums1.length; i++) {
            exist[nums1[i]] = true;
        }

        int cnt = 0;
        int maxLen = nums1.length > nums2.length ? nums1.length : nums2.length;
        int[] temp = new int[maxLen];
        for (int i = 0; i < nums2.length; i++) {
            if (exist[nums2[i]]) {
                temp[cnt++] = nums2[i];
                exist[nums2[i]] = false;
            }
        }
        return Arrays.copyOf(temp, cnt);
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
