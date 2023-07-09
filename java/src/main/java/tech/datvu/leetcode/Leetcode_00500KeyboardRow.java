package tech.datvu.leetcode;

import java.util.Arrays;

public class Leetcode_00500KeyboardRow {
    public static String[] findWords(String[] words) {

        char[] second = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' };
        char[] third = { 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

        int[] keys = new int[255];

        for (int i = 0; i < second.length; i++) {
            keys[second[i]] = 1;
        }
        for (int i = 0; i < third.length; i++) {
            keys[third[i]] = 2;
        }
        String[] res = new String[words.length];

        int resIndex = 0;
        for (int i = 0; i < words.length; i++) {
            int j = 0;
            for (; j < words[i].length() - 1; j++) {
                char cur = words[i].charAt(j);
                char next = words[i].charAt(j + 1);
                if ('A' <= cur && cur <= 'Z') {
                    cur += 32;
                }
                if ('A' <= next && next <= 'Z') {
                    next += 32;
                }
                if (keys[cur] != keys[next]) {
                    break;
                }
            }
            if (j >= words[i].length() - 1) {
                res[resIndex++] = words[i];
            }
        }
        return res = Arrays.copyOf(res, resIndex);
    }

    public static void main(String[] args) {
        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        System.out.println(Arrays.toString(findWords(words)));
    }
}
