package tech.datvu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_00169MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!cnt.containsKey(nums[i])) {
                cnt.put(nums[i], 1);
            } else {
                cnt.replace(nums[i], cnt.get(nums[i]) + 1);
            }
            if (cnt.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
