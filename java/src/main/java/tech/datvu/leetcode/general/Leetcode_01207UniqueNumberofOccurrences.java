package tech.datvu.leetcode.general;

import java.util.Map;
import java.util.TreeMap;

public class Leetcode_01207UniqueNumberofOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> cnts = new TreeMap<>();

        for (int i : arr) {
            if (!cnts.containsKey(i)) {
                cnts.put(i, 1);
            } else {
                cnts.put(i, cnts.get(i) + 1);
            }
        }
        boolean[] exists = new boolean[1001];
        for (Integer key : cnts.keySet()) {
            if (exists[cnts.get(key)]) {
                return false;
            } else {
                exists[cnts.get(key)] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
}
