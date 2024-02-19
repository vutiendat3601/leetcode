package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_02130MaximumTwinSumofaLinkedList {

    public static ListNode reverse(ListNode head, ListNode next) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head.next = next;
            return head;
        }
        ListNode cur = head.next;
        head.next = next;
        return reverse(cur, head);
    }

    public static ListNode mid(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int pairSum(ListNode head) {

        ListNode mid = mid(head);
        ListNode right = mid.next;
        mid.next = null;
        right = reverse(right, null);
        int max = head.val + right.val;
        while (head.next != null) {
            head = head.next;
            right = right.next;
            max = max > head.val + right.val ? max : head.val + right.val;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = new int[] { 47, 22, 81, 46, 94, 95, 90, 22, 55, 91, 6, 83, 49, 65, 10,
                32, 41, 26, 83, 99, 14, 85, 42, 99, 89, 69, 30, 92, 32, 74, 9, 81, 5, 9 };
        ListNode head = ListNode.createFromArray(data);
        System.out.println(data.length);
        int max = pairSum(head);
        System.out.println(max);
    }
}
