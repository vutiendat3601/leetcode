package tech.datvu.leetcode;

public class Leetcode_00141LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;

        while (fs != null && fs.next != null) {
            sl = sl.next;
            fs = fs.next.next;
            if (sl == fs){
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
