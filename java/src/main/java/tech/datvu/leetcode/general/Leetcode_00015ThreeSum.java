package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_00015ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != pre) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        right--;
                        while (left < right && nums[right] == nums[right+1]) {
                            right--;
                        }
                    } else if (nums[i] + nums[left] + nums[right] < 0) {
                        left++;
                    } else if (nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    }
                }
            }
            pre=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 };
        List<List<Integer>> res = threeSum(nums);
        res.forEach(s -> {
            s.forEach(n -> System.out.print(n + " "));
            System.out.println();
        });
    }
}
