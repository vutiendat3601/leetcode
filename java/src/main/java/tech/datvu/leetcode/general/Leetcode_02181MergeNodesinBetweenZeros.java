package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_02181MergeNodesinBetweenZeros {
    public static ListNode mergeNodes(ListNode head) {
        ListNode originHead = head;

        ListNode f = head.next;

        while (f != null) {
            if (f.val == 0) {
                if (f.next == null) {
                    head.next = null;
                } else {
                    head.next = f;
                    head = head.next;
                }
            } else {
                head.val += f.val;
            }
            f = f.next;
        }

        return originHead;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 0, 3, 1, 0, 4, 5, 2, 0 });
        head = mergeNodes(head);
        ListNode.traverList(head);
    }
}
