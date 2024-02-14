package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_00506RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];

        int max = 0;
        for (int i : score) {
            max = max > i ? max : i;
        }
        int[] pos = new int[max + 1];

        for (int i = 0; i < score.length; i++) {
            pos[score[i]] = i + 1;
        }

        int cnt = 1;
        for (int i = max; i >= 0; i--) {
            if (pos[i] != 0) {
                switch (cnt) {
                    case 1:
                        res[pos[i] - 1] = "Gold Medal";
                        break;
                    case 2:
                        res[pos[i] - 1] = "Silver Medal";
                        break;
                    case 3:
                        res[pos[i] - 1] = "Bronze Medal";
                        break;
                    default:
                        res[pos[i] - 1] = Integer.toString(cnt);
                }
                cnt++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] score = { 3, 8, 10, 9, 4 };
        String[] res = findRelativeRanks(score);
        System.out.println(Arrays.toString(res));
    }
}
