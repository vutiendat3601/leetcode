package tech.datvu.leetcode;

public class Test {
    public static void main(String[] args) {
        ListNode second = new ListNode();
        second.val = 2;
        second.next = null;
        ListNode head = new ListNode();
        head.val = 1;
        head.next = second;

        ListNode.traverList(head);

        head = ListNode.insertAtHead(head, 3);
        ListNode.traverList(head);
    }
}
