package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00061RotateList {

    public static int size(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public static ListNode rotate(ListNode head, int k) {
        if (k <= 0) {
            return head;
        }

        ListNode originHead = head;
        ListNode preNode = head;
        while (head.next != null) {
            preNode = head;
            head = head.next;
        }
        preNode.next = null;
        head.next = head == originHead ? null : originHead;
        return rotateRight(head, k - 1);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        int len = size(head);
        if (len == 0 || head == null) {
            return head;
        }
        k %= len;
        return rotate(head, k);
    }

    public static void main(String[] args) {
        // ListNode h3 = new ListNode(3);
        ListNode h2 = new ListNode(2, null);
        ListNode h1 = new ListNode(1, h2);
        ListNode.traverList(h1);
        h1 = rotateRight(h1, 2);
        // System.out.println(ListNode.size(h1));
        ListNode.traverList(h1);
    }
}
