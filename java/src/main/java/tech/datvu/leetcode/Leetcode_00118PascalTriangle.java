package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_00118PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l0 = new ArrayList<>();
        l0.add(0, 1);
        res.add(0, l0);
        for (int i = 1; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(0, 1);
            for (int j = 1; j < i; j++) {
                l.add(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            l.add(i, 1);
            res.add(l);
        }
        return res;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> res = generate(numRows);
        res.forEach(o1 -> {
            o1.forEach(o2 -> System.out.print(o2));
            System.out.println();
        });
    }
}