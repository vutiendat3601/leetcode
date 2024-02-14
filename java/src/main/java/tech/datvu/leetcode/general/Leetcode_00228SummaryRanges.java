package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00228SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return res;
        }

        int left = nums[0];
        StringBuilder temp = new StringBuilder();
        temp.append(left);

        // Tim cac range trong day
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (nums[i - 1] != left) {
                    temp.append("->");
                    temp.append(nums[i - 1]);
                }
                res.add(temp.toString());
                left = nums[i];
                temp.setLength(0);
                temp.append(left);
            }
        }

        // Tim range cuoi cung
        if (nums[nums.length - 1] != left) {
            temp.append("->");
            temp.append(nums[nums.length - 1]);
        }
        res.add(temp.toString());

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        List<String> res = summaryRanges(nums);
        res.forEach(o -> System.out.println(o));
    }
}
