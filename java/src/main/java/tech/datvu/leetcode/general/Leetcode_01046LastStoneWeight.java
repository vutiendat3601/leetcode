package tech.datvu.leetcode.general;

import java.util.PriorityQueue;

public class Leetcode_01046LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size() > 1) {
            int v1 = pq.poll();
            int v2 = pq.poll();
            if (v1 > v2) {
                pq.add(v1 - v2);
            }

        }
        return pq.size() == 0 ? 0 : pq.poll();
    }

    public static void main(String[] args) {
        int[] stones = { 3, 7, 8 };
        int res = lastStoneWeight(stones);
        System.out.println(res);
    }
}
