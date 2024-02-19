package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00083RemoveDuplicatesfromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            } else {
                cur=cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode fifth = new ListNode(3);
        ListNode fourth = new ListNode(3, fifth);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(1, third);
        ListNode head = new ListNode(1, second);
        head = deleteDuplicates(head);
        ListNode.traverList(head);
    }
}
