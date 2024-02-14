package tech.datvu.leetcode.general;

public class Leetcode_00234PalindromeLinkedList {

    public static ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }

    public static ListNode reverseList(ListNode head, ListNode next) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            head.next = next;
            return head;
        }
        ListNode curNode = head.next;
        head.next = next;
        return reverseList(curNode, head);
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        fast = head;
        while (fast != null && slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 2, 3, 2, 1 });
        System.out.println(isPalindrome(head));
    }
}
