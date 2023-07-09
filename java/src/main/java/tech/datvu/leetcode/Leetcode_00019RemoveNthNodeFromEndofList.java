package tech.datvu.leetcode;

public class Leetcode_00019RemoveNthNodeFromEndofList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fNode = head;
        ListNode sNode = head;
        for (int i = 1; i <= n; i++) {
            fNode = fNode.next;
        }

        if (fNode == null) {
            return head.next;
        }

        while (fNode.next != null) {
            sNode = sNode.next;
            fNode = fNode.next;
        }

        sNode.next = sNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode second = new ListNode(2, null);
        ListNode third = new ListNode(3, null);
        ListNode fourth = new ListNode(4, null);
        ListNode fifth = new ListNode(5, null);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        ListNode.traverList(head);
        head = removeNthFromEnd(head, 2);
        ListNode.traverList(head);
    }
}
