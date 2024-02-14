package tech.datvu.leetcode.general;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_02085CountCommonWordsWithOneOccurrence {

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> words1Cnt = new HashMap<>();
        Map<String, Integer> words2Cnt = new HashMap<>();

        for (int i = 0; i < words1.length; i++) {
            if (!words1Cnt.containsKey(words1[i])) {
                words1Cnt.put(words1[i], 1);
            } else {
                words1Cnt.put(words1[i], words1Cnt.get(words1[i]) + 1);
            }
        }
        for (int i = 0; i < words2.length; i++) {
            if (!words2Cnt.containsKey(words2[i])) {
                words2Cnt.put(words2[i], 1);
            } else {
                words2Cnt.put(words2[i], words2Cnt.get(words2[i]) + 1);
            }
        }

        int cnt = 0;
        for (int i = 0; i < words1.length; i++) {
            if (words1Cnt.get(words1[i]) == 1) {
                if (words2Cnt.containsKey(words1[i]) && words2Cnt.get(words1[i]) == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String[] words1 = { "leetcode", "is", "amazing", "as", "is" };
        String[] words2 = { "amazing", "leetcode", "is" };
        int res = countWords(words1, words2);
        System.out.println(res);
    }
}
