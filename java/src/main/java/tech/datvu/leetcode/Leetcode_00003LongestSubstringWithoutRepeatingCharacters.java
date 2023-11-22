package tech.datvu.leetcode;

public class Leetcode_00003LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        boolean[] e = new boolean[128];
        int l = -1;
        char[] chars = s.toCharArray();
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (e[chars[i]]) {
                while (chars[++l] != chars[i]) {
                    e[chars[l]] = false;
                    cnt--;
                }
                cnt--;
            }
            cnt++;
            max = max >= cnt ? max : cnt;
            e[chars[i]] = true;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
