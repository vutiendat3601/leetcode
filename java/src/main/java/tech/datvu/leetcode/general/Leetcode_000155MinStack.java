package tech.datvu.leetcode.general;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_000155MinStack {
    private class ListNode {
        private int val;
        private int min;
        private ListNode next;

        public int getVal() {
            return val;
        }

        public int getMin() {
            return min;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    private ListNode head;

    public Leetcode_000155MinStack() {
    }

    public void push(int val) {
        if (head == null) {
            head = new ListNode(val, val, null);
        } else {
            head = new ListNode(val, val <= head.min ? val : head.min, head);
        }
    }

    public void pop() {
        head = head.getNext();
    }

    public int top() {
        return head.getVal();
    }

    public int getMin() {
        return head.getMin();
    }

    public static void main(String[] args) {

        Leetcode_000155MinStack minStack = new Leetcode_000155MinStack();
        List<Integer> res = new ArrayList<>();
        String[][] input = new String[][] {
                { "MinStack", "push", "push", "push", "push", "getMin", "pop", "getMin", "pop", "getMin", "pop",
                        "getMin" },
                { null, "2", "0", "3", "0", null, null, null, null, null, null, null } };

        for (int i = 0; i < input[0].length; i++) {
            if (input[0][i].equals("MinStack")) {
                res.add(null);
            } else if (input[0][i].equals("push")) {
                res.add(null);
                minStack.push(Integer.parseInt(input[1][i]));
            } else if (input[0][i].equals("pop")) {
                res.add(null);
                minStack.pop();
            } else if (input[0][i].equals("top")) {
                res.add(minStack.top());
            } else if (input[0][i].equals("getMin")) {
                res.add(minStack.getMin());
            }
        }
        res.forEach(e -> System.out.print(e + " "));
    }
}
