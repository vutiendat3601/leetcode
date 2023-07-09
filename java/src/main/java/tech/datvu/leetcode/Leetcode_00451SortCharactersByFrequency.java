package tech.datvu.leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode_00451SortCharactersByFrequency {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        PriorityQueue<Character> q = new PriorityQueue<Character>((a, b) -> Integer.compare(map.get(b), map.get(a)));
        for (Character ch : map.keySet())
            q.add(ch);
        StringBuilder res = new StringBuilder();
        while (!q.isEmpty()) {
            char ch = q.poll();
            for (int i = 0; i < map.get(ch); i++)
                res.append(ch);
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
