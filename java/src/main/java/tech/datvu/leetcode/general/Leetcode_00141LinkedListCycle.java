package tech.datvu.leetcode.general;

public class Leetcode_00141LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode fourth = new ListNode(-4);
        ListNode third = new ListNode(0, fourth);
        ListNode second = new ListNode(2, third);
        fourth.next = second;
        ListNode head = new ListNode(3, second);
        System.out.println(hasCycle(head));
    }
}
