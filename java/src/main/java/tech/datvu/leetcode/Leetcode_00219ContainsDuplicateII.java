package tech.datvu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_00219ContainsDuplicateII {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // Neu da phan tu da ton tai lay vi tri hien tai tru vi tri truoc do de kiem tra
            if (indices.containsKey(nums[i])) {
                if (i - indices.get(nums[i]) <= k) {
                    return true;
                }
                indices.replace(nums[i], i);
            } else {
                indices.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
        int k = 3;
        boolean res = containsNearbyDuplicate(nums, k);
        System.out.println(res);
    }
}
