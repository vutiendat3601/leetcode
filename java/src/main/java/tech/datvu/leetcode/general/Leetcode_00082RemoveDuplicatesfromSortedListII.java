package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00082RemoveDuplicatesfromSortedListII {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode beforeHead = new ListNode(-101, head);
        ListNode prevNode = beforeHead;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prevNode.next = head.next;
            } else {
                prevNode = prevNode.next;
            }
            head = head.next;
        }
        return beforeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 2, 2, 3, 4, 4 });
        ListNode.traverList(head);
        head = deleteDuplicates(head);
        ListNode.traverList(head);
    }
}
