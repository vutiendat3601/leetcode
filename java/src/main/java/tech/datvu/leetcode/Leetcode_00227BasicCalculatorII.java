package tech.datvu.leetcode;

import java.io.FileNotFoundException;

public class Leetcode_00227BasicCalculatorII {

    public static int calculate(String s) {
        s = s.replace(" ", "");
        char[] chars = s.toCharArray();
        String numStr = "";
        char operator = '+';
        int a = 0;
        int b = 0;
        int preA = 0;

        int i = 0;
        while (i < chars.length) {
            if (Character.isDigit(chars[i])) {
                numStr += chars[i];
            } else {
                operator = chars[i] == '-' ? '+' : chars[i];
                a = Integer.parseInt(numStr);
                numStr = chars[i] == '-' ? "-" : "";
                i++;
                break;
            }
            i++;
        }
        for (; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                numStr += chars[i];
            } else {
                b = Integer.parseInt(numStr);
                preA = operator == '+' ? a : preA;
                a = calculate(a, b, operator);
                a = operator != '+' ? a + preA : a;
                operator = chars[i] == '-' ? '+' : chars[i];
                a = operator != '+' ? a - preA : a;
                numStr = chars[i] == '-' ? "-" : "";
            }
        }
        b = Integer.parseInt(numStr);
        a = calculate(a, b, operator);
        a = operator != '+' ? a + preA : a;
        return a;
    }

    public static int calculate(int a, int b, char operator) {
        if (operator == '*') {
            return a * b;
        }
        if (operator == '/') {
            return a / b;
        }
        return a + b;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(calculate("3+2*2"));
    }
}
