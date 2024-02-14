package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_01431KidsWiththeGreatestNumberofCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = max > candies[i] ? max : candies[i];
        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(i, true);
            } else {
                res.add(i, false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        res.forEach(o -> System.out.print(o + " "));
        System.out.println();
    }
}
