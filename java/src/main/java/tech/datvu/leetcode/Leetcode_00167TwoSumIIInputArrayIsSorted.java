package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00167TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[] { i + 1, j + 1 };
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
}
