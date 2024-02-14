package tech.datvu.leetcode.general;

import java.util.Stack;

public class Leetcode_00232ImplementQueueusingStacks {

    // Attributes
    private Stack<Integer> data;
    private Stack<Integer> temp;

    public Leetcode_00232ImplementQueueusingStacks() {
        data = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        while (!data.empty()) {
            temp.push(data.pop());
        }
        data.push(x);
        while (!temp.empty()) {
            data.push(temp.pop());
        }
    }

    public int pop() {
        return data.pop();
    }

    public int peek() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode_00232ImplementQueueusingStacks q = new Leetcode_00232ImplementQueueusingStacks();
        System.out.println(q.empty());
        q.push(0);
        q.push(1);
        q.push(3);
        q.push(2);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
