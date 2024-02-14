package tech.datvu.leetcode.general;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_00217ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        for (int i : nums) {
            if (!exists.contains(i)) {
                exists.add(i);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}
