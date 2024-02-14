package tech.datvu.leetcode.general;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_00933NumberofRecentCalls {

    private Queue<Integer> counter;

    public Leetcode_00933NumberofRecentCalls() {
        counter = new LinkedList<>();
    }

    public int ping(int t) {
        counter.add(t);
        while (!counter.isEmpty() && counter.peek() < t - 3000) {
            counter.poll();
        }
        return counter.size();
    }

    public static void main(String[] args) {
        int[] in = { 1, 100, 3001, 3002 };
        int [] res = new int[in.length];

        Leetcode_00933NumberofRecentCalls x = new  Leetcode_00933NumberofRecentCalls();

        for (int i = 0;i<in.length;i++) {
            res[i] = x.ping(in[i]);
        }

        System.out.println(Arrays.toString(res));
    }
}
