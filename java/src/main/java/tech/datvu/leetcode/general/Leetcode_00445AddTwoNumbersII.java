package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00445AddTwoNumbersII {

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

    public static void add(ListNode l1, ListNode l2, int carry) {
        int sum = 0;
        sum += l1 == null ? 0 : l1.val;
        sum += l2 == null ? 0 : l2.val;
        sum += carry;
        carry = sum > 9 ? 1 : 0;
        l2.val = sum % 10;
        l1 = l1 == null ? null : l1.next;
        if (l1 != null || carry > 0) {
            if (l2.next == null) {
                l2.next = new ListNode();
            }
            add(l1, l2.next, carry);
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1, null);
        l2 = reverse(l2, null);
        add(l1, l2, 0);
        return reverse(l2, null);
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.createFromArray(new int[] { 7, 2, 4, 3 });
        ListNode l2 = ListNode.createFromArray(new int[] { 5, 6, 4 });
        l2 = addTwoNumbers(l1, l2);
        ListNode.traverList(l2);
    }
}
