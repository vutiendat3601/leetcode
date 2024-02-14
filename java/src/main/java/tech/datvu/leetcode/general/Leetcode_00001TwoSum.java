package tech.datvu.leetcode.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_00001TwoSum {

    private static Map<Integer, Integer> visitedNums = new HashMap<>();

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (!visitedNums.containsKey(target - nums[i])) {
                visitedNums.put(nums[i], i);
            } else {
                return new int[] { i, visitedNums.get(target - nums[i]) };
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}