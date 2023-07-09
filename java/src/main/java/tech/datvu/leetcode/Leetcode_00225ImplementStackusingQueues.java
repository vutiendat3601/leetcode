package tech.datvu.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_00225ImplementStackusingQueues {

    // Attributes
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private Queue<Integer> curData;

    public Leetcode_00225ImplementStackusingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        curData = q1;
    }

    public void push(int x) {
        if (curData == q1) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            curData = q2;
        } else {
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            curData = q1;
        }
    }

    public int pop() {
        return curData.poll();
    }

    public int top() {
        return curData.peek();
    }

    public boolean empty() {
        return curData.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode_00225ImplementStackusingQueues s = new Leetcode_00225ImplementStackusingQueues();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}