package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_01002FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        char[] fWChars = words[0].toCharArray();
        for (char c : fWChars) {
            boolean exist = true;
            for (int i = 1; i < words.length; i++) {
                if (!words[i].contains(String.valueOf(c))) {
                    exist = false;
                    break;
                } else {
                    words[i] = words[i].replaceFirst(String.valueOf(c), "");
                }
            }
            if (exist) {
                res.add(String.valueOf(c));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "cool", "lock", "cook" };
        List<String> res = commonChars(words);
        System.out.println(res);
    }
}
