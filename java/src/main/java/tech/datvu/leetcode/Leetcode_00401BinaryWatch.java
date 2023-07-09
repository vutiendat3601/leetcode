package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_00401BinaryWatch {

    private static int MAX_MINUTE_LIGHT = 5;
    private static int MAX_HOUR_LIGHT = 3;
    private static final int[] HRS = { 1, 2, 4, 8 };
    private static final int[] MINS = { 1, 2, 4, 8, 16, 32 };

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        if (turnedOn > 8) {
            return res;
        }
        if (turnedOn == 0) {
            res.add("0:00");
            return res;
        }
        getHoursAndMinutes(turnedOn, res);
        Collections.sort(res);
        return res;
    }

    public static void getHoursAndMinutes(int turnedOn, List<String> res) {
        List<String> hours = new ArrayList<>();
        List<String> minutes = new ArrayList<>();
        int maxMinuteLight = turnedOn > MAX_MINUTE_LIGHT ? MAX_MINUTE_LIGHT : turnedOn;
        for (int i = 0; i <= maxMinuteLight; i++) {
            genSubMins(minutes, i, 1);
            if (turnedOn - i <= MAX_HOUR_LIGHT) {
                genSubHrs(hours, turnedOn - i, 1);
                if (!hours.isEmpty() && !minutes.isEmpty()) {
                    hours.forEach(h -> {
                        minutes.forEach(m -> res.add(h + ":" + String.format("%02d", Integer.valueOf(m))));
                    });
                } else if (!hours.isEmpty()) {
                    hours.forEach(h -> res.add(h + ":00"));
                } else if (!minutes.isEmpty()) {
                    minutes.forEach(m -> res.add("0:" + String.format("%02d", Integer.valueOf(m))));
                }
            }
            minutes.clear();
            hours.clear();
        }
    }

    private static int[] resIndices = new int[100];

    public static void genSubMins(List<String> res, int k, int iTh) {
        if (k < 1) {
            return;
        }
        for (int i = resIndices[iTh - 1] + 1; i <= MINS.length - k + iTh; i++) {
            resIndices[iTh] = i;
            if (iTh == k) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += MINS[resIndices[j] - 1];
                }
                if (sum < 60) {
                    res.add(String.valueOf(sum));
                }
            } else {
                genSubMins(res, k, iTh + 1);
            }
        }
    }

    public static void genSubHrs(List<String> res, int k, int iTh) {
        if (k < 1) {
            return;
        }
        for (int i = resIndices[iTh - 1] + 1; i <= HRS.length - k + iTh; i++) {
            resIndices[iTh] = i;
            if (iTh == k) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += HRS[resIndices[j] - 1];
                }
                if (sum < 12) {
                    res.add(String.valueOf(sum));
                }
            } else {
                genSubHrs(res, k, iTh + 1);
            }
        }
    }

    public static void main(String[] args) {
        readBinaryWatch(2);
    }
}
