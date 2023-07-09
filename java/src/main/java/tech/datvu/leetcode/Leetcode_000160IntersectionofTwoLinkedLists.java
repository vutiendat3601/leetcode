package tech.datvu.leetcode;

public class Leetcode_000160IntersectionofTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode end1 = new ListNode(5);
        ListNode end2 = new ListNode(4, end1);
        ListNode end3 = new ListNode(8, end2);
        ListNode second1 = new ListNode(1, end3);
        ListNode head1 = new ListNode(4,second1);
        ListNode third2 = new ListNode(1, end3);
        ListNode second2 = new ListNode(6, third2);
        ListNode head2 = new ListNode(5, second2);
        ListNode res = getIntersectionNode(head1, head2);
        ListNode.traverList(res);
    }
}
