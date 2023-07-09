package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_00119PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> data = new ArrayList<>();
        List<Integer> row0 = new ArrayList<>();
        row0.addAll(Arrays.asList(1));
        data.add(row0);
        List<Integer> row1 = new ArrayList<>();
        row1.addAll(Arrays.asList(1, 1));
        data.add(row1);

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> rowI = new ArrayList<>();
            rowI.add(1);
            for (int j = 0; j < data.get(i - 1).size() - 1; j++) {
                rowI.add(data.get(i - 1).get(j) + data.get(i - 1).get(j + 1));
            }
            rowI.add(1);
            data.add(rowI);
        }

        return data.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 30;
        List<Integer> res = getRow(rowIndex);
        System.out.println(res);
    }
}