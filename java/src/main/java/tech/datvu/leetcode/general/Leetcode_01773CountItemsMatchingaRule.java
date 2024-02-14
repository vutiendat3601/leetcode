package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_01773CountItemsMatchingaRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        switch (ruleKey) {
            case "type":
                for (List<String> i : items) {
                    if (i.get(0).equals(ruleValue)) {
                        res++;
                    }
                }
                break;

            case "color":
                for (List<String> i : items) {
                    if (i.get(1).equals(ruleValue)) {
                        res++;
                    }
                }
                break;
            case "name":

                for (List<String> i : items) {
                    if (i.get(2).equals(ruleValue)) {
                        res++;
                    }
                }
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add(0, "phone");
        l1.add(1, "blue");
        l1.add(2, "pixel");
        items.add(l1);
        List<String> l2 = new ArrayList<>();
        l2.add(0, "computer");
        l2.add(1, "silver");
        l2.add(2, "lenovo");
        items.add(l2);
        List<String> l3 = new ArrayList<>(); // implementation
        l3.add(0, "phone");
        l3.add(1, "blue");
        l3.add(2, "pixel");
        items.add(l3);

        String ruleKey = "color";
        String ruleValue = "silver";
        int res = countMatches(items, ruleKey, ruleValue);
        System.out.println(res);
    }
}
