package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

// ## Bottom -> up
public class Leetcode_00068TextJustification {
    private static String[] spaces;

    static {
        final int MAX_NUM_OF_SPACES = 100;
        spaces = new String[MAX_NUM_OF_SPACES + 1];
        spaces[0] = "";
        for (int i = 1; i <= MAX_NUM_OF_SPACES; i++) {
            spaces[i] = spaces[i - 1] + " ";
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> tmpWords = new ArrayList<>();
        StringBuilder tmpResult = new StringBuilder(words[0] + spaces[maxWidth - words[0].length()]);
        tmpWords.add(words[0]);
        int sumChars = words[0].length();
        int i = 1;
        while (i < words.length) {
            sumChars += words[i].length();
            if (sumChars + tmpWords.size() > maxWidth) {
                result.add(tmpResult.toString());
                tmpResult = new StringBuilder(words[i] + spaces[maxWidth - words[i].length()]);
                sumChars = words[i].length();
                tmpWords.clear();
                tmpWords.add(words[i]);
            } else {
                tmpWords.add(words[i]);
                int numOfSpaces = maxWidth - sumChars;
                int numOfSep = tmpWords.size() - 1;

                // ## Get the upper spaces for the left words.
                int evenD = numOfSep < 1 ? numOfSpaces : ((int) Math.ceil(numOfSpaces * 1F / numOfSep));
                tmpResult = new StringBuilder();
                for (String tmpWord : tmpWords) {
                    tmpResult.append(tmpWord + spaces[evenD]);
                    numOfSpaces -= evenD;
                    numOfSep--;
                    evenD = numOfSep < 1 ? numOfSpaces : ((int) Math.ceil(numOfSpaces * 1F / numOfSep));
                }
            }
            i++;
        }
        if (!tmpWords.isEmpty()) {
            tmpResult = new StringBuilder();
            for (String tmpWord : tmpWords) {
                tmpResult.append(tmpWord + " ");
            }
            tmpResult.deleteCharAt(tmpResult.length() - 1);
            tmpResult.append(spaces[maxWidth - tmpResult.length()]);
            result.add(tmpResult.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = { "ask", "not", "what", "your", "country", "can", "do", "for", "you", "ask", "what", "you",
                "can", "do", "for", "your", "country" };
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));
    }
}
