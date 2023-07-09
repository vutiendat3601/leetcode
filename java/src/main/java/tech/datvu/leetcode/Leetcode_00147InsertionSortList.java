package tech.datvu.leetcode;

public class Leetcode_00147InsertionSortList {

    public static ListNode insertionSortLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = findMid(head);
        ListNode h1 = head;
        ListNode h2 = null;
        if (mid != null) {
            h2 = mid.next;
            mid.next = null;
        }
        h1 = insertionSortLinkedList(h1);
        h2 = insertionSortLinkedList(h2);
        return merge(h1, h2);
    }

    public static ListNode findMid(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        ListNode pre = null;
        while (f != null && f.next != null) {
            pre = s;
            s = s.next;
            f = f.next.next;
        }
        return f == null ? pre : s;
    }

    public static ListNode merge(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }
        ListNode root = new ListNode(-1);
        ListNode res = root;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                res.next = h1;
                h1 = h1.next;
            } else {
                res.next = h2;
                h2 = h2.next;
            }
            res = res.next;
        }
        while (h1 != null) {
            res.next = h1;
            h1 = h1.next;
            res=res.next;
        }
        while (h2 != null) {
            res.next = h2;
            h2 = h2.next;
            res=res.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(1);

        head.next = second;
        second.next = third;
        head = insertionSortLinkedList(head);
        ListNode.traverList(head);
    }
}
