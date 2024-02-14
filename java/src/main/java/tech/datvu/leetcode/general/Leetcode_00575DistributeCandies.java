package tech.datvu.leetcode.general;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_00575DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        
        Set<Integer> type = new HashSet<>();

        for (int i = 0; i < candyType.length; i++) {
            type.add(candyType[i]);
        }
        int possibleEating = candyType.length / 2;
        return possibleEating < type.size() ? possibleEating : type.size();
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int res = distributeCandies(candyType);
        System.out.println(res);
    }
}
