package tech.datvu.leetcode.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode_01636SortArraybyIncreasingFrequency {

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int n : nums) {
            freq.put(n, 1 + freq.getOrDefault(n, 0));
        }
        Queue<Integer> pq = new PriorityQueue<Integer>(
                Comparator.<Integer, Integer>comparing(i -> freq.get(i)).thenComparing(i -> i));
        for (int n : nums) {
            pq.offer(n);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; !pq.isEmpty(); ++i) {
            ans[i] = pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 3, 2 };
        nums = frequencySort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
