package tech.datvu.leetcode.general;

public class Leetcode_02095DeletetheMiddleNodeofaLinkedList {

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        if (head.next.next == null) {
            head.next = null;
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast == null) {
                slow.next = slow.next.next;
            } else if (fast.next == null) {
                slow = slow.next;
                slow.next = slow.next.next;
            }
            slow = slow.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 3 });
        ListNode.traverList(head);
        deleteMiddle(head);
        ListNode.traverList(head);
    }
}
