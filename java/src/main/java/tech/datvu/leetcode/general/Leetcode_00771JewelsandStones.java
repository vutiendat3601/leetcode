package tech.datvu.leetcode.general;

import java.util.Set;
import java.util.stream.Collectors;

public class Leetcode_00771JewelsandStones {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsChars = jewels.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        int cnt = 0;

        for (char i : stones.toCharArray()) {
            if (jewelsChars.contains(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}
