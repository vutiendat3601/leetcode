package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00237DeleteNodeinaLinkedList {

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        ListNode fourth = new ListNode(9);
        ListNode third = new ListNode(1, fourth);
        ListNode second = new ListNode(5, third);
        ListNode head = new ListNode(4, second);
        deleteNode(second);
        ListNode.traverList(head);
    }
}
