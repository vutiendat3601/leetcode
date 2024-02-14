package tech.datvu.leetcode.general;

import java.util.Stack;

public class Leetcode_00682BaseballGame {

    public static int calPoints(String[] ops) {
        Stack<Integer> points = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            try {
                int point = Integer.parseInt(ops[i]);
                points.push(point);
            } catch (Exception e) {
                switch (ops[i]) {
                    case "C":
                        points.pop();
                        break;
                    case "D":
                        points.push(points.peek() * 2);
                        break;
                    case "+":
                        int x = points.pop();
                        int sum = x + points.peek();
                        points.push(x);
                        points.push(sum);
                        break;
                }
            }
        }
        int res = 0;
        while (!points.empty()) {
            res += points.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] ops = { "1","C" };
        System.out.println(calPoints(ops));
    }
}
