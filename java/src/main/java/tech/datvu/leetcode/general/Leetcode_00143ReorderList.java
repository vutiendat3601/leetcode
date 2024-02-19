package tech.datvu.leetcode.general;

import java.util.Stack;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00143ReorderList {

    public static void reorderList(ListNode head) {
        ListNode midNode = getMidNode(head);
        ListNode tmpNode = midNode == null ? midNode : midNode.next;
        midNode.next = null;
        Stack<ListNode> stack = new Stack<>();
        while (tmpNode != null) {
            stack.push(tmpNode);
            tmpNode = tmpNode.next;
        }

        tmpNode = head;
        while (!stack.empty()) {
            ListNode nextNode = tmpNode.next;
            ListNode stackNode = stack.pop();
            tmpNode.next = stackNode;
            stackNode.next = nextNode;
            tmpNode = nextNode;
        }
    }

    public static ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode n1 = ListNode.createFromArray(1, 2, 3, 4, 5, 6, 7);
        reorderList(n1);
        ListNode.traverList(n1);
    }
}
