package tech.datvu.leetcode;

public class Leetcode_00148SortList {

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = mid(head);

        ListNode right = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        right = sortList(right);

        return merge(left, right);
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode res = new ListNode(-101, null);
        ListNode temp = res;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return res.next;
    }

    public static ListNode mid(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { -1, 5, 3, 4 });
        ListNode.traverList(head);
        head = sortList(head);
        ListNode.traverList(head);
    }
}
