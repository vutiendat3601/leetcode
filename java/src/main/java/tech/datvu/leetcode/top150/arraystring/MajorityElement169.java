package tech.datvu.leetcode.top150.arraystring;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    // ## Map
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numberCnts = new HashMap<>();
        int num = nums[0];
        numberCnts.put(nums[0], 1);
        for (int i = 1; i < nums.length; i++) {
            Integer cnt = numberCnts.get(nums[i]);
            if (cnt == null) {
                numberCnts.put(nums[i], 1);
            } else {
                cnt++;
                if (cnt > nums.length / 2) {
                    return nums[i];
                }
                numberCnts.put(nums[i], cnt);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 2, 1, 1, 2, 2 };
        MajorityElement169 majorityElement169 = new MajorityElement169();
        int res = majorityElement169.majorityElement(nums);
        System.out.println(res);
    }
}
