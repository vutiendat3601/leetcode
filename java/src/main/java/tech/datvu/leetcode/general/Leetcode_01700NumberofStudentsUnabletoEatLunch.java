package tech.datvu.leetcode.general;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode_01700NumberofStudentsUnabletoEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qStudents = new LinkedList<>();
        Stack<Integer> qSandwiches = new Stack<>();
        for (int i = 0; i < students.length; i++) {
            qStudents.add(students[i]);
        }
        for (int i = students.length - 1; i >= 0; i--) {
            qSandwiches.add(sandwiches[i]);
        }
        int len = students.length;
        int cnt = 0;
        while (cnt < len && !qStudents.isEmpty()) {
            if (qStudents.peek() == qSandwiches.peek()) {
                qStudents.poll();
                qSandwiches.pop();
                cnt = 0;
                len--;
            } else {
                qStudents.add(qStudents.poll());
                cnt++;
            }
        }
        return qStudents.size();
    }

    public static void main(String[] args) {
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
        System.out.println(countStudents(students, sandwiches));
    }
}
