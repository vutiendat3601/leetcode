package tech.datvu.leetcode;

public class Leetcode_00086PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(-101, head);
        ListNode prevNode = beforeHead;

        while (head != null) {
            if (head.val < x) {
                prevNode = head;
                head = head.next;
            } else {
                break;
            }
        }
        if (head != null) {
            ListNode temp = null;
            while (head.next != null) {
                temp = head;
                head = head.next;
                if (head.val < x) {
                    temp.next = head.next;
                    head.next = prevNode.next;
                    prevNode.next = head;
                    prevNode = prevNode.next;
                    head = temp;
                }
            }
        }
        return beforeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 2, 1 });
        int x = 2;
        head = partition(head, x);
        ListNode.traverList(head);
    }
}
