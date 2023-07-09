package tech.datvu.leetcode;

public class Leetcode_000206ReverseLinkedList {

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

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 2, 3, 4, 5 });
        ListNode.traverList(head);
        head = reverseList(head, null);
        ListNode.traverList(head);
    }
}
