package tech.datvu.leetcode.general;

public class Leetcode_00495TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration - 1 < timeSeries[i + 1]) {
                res += duration;
            } else {
                res += (timeSeries[i + 1] - timeSeries[i]);
            }
        }
        res += duration;
        return res;
    }

    public static void main(String[] args) {
        int[] timeSeries = { 1, 3, 7, 12 };
        int duration = 3;
        int res = findPoisonedDuration(timeSeries, duration);
        System.out.println(res);
    }
}
