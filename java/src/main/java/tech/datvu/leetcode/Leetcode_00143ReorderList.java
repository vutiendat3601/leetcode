package tech.datvu.leetcode;

public class Leetcode_00143ReorderList {

    public static void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        ListNode next = head.next;
        head.next = getEnd(head, null);
        if (head.next != null) {
            head.next.next = next;
        }
        reorderList(next);
    }

    public static ListNode getEnd(ListNode head, ListNode beforeEnd) {
        if (head.next == null) {
            if (beforeEnd != null) {
                beforeEnd.next = null;
            }
            return head;
        }
        return getEnd(head.next, head);
    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(6);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        reorderList(n1);
        System.out.println(getEnd(n1, null).val);
        ListNode.traverList(n1);
    }
}
