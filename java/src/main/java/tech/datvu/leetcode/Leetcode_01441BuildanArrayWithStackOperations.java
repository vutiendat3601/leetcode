package tech.datvu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_01441BuildanArrayWithStackOperations {

    public static List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int cnt = 1;
        int i = 0;
        while (i < target.length) {
            if (cnt == target[i]) {
                res.add("Push");
                i++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
            cnt++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] target = { 1, 3 };
        int n = 3;
        List<String> res = buildArray(target, n);
        res.forEach(e -> System.out.println(e));
    }
}
