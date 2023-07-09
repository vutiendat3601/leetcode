package tech.datvu.leetcode;

public class Leetcode_01732FindtheHighestAltitude {

    public static int largestAltitude(int[] gain) {
        int res = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < gain.length; i++) {
            temp += gain[i];
            res = res > temp ? res : temp;
        }
        return res >= 0 ? res : 0;
    }

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int res = largestAltitude(gain);
        System.out.println(res);
    }
}
