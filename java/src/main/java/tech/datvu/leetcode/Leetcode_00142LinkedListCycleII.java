package tech.datvu.leetcode;

public class Leetcode_00142LinkedListCycleII {
    public static ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                break;
            }
        }
        if (q == null || q.next == null) {
            return null;
        }
        q = head;
        while (p != q) {
            q = q.next;
            p = p.next;
        }
        return q;
    }

    public static void removeLoop(ListNode loop) {
        ListNode pre = loop;
        ListNode tmp = loop.next;
        while (tmp != loop) {
            pre = tmp;
            tmp = tmp.next;
        }
        pre.next = null;
    }

    public static void main(String[] args) {
        ListNode n1 = ListNode.createFromArray(3, 2, 0, -4);
        n1.next.next.next.next = n1.next;
        ListNode cycleNode = detectCycle(n1);
        if (cycleNode != null) {
            System.out.println(cycleNode.val);
            removeLoop(cycleNode);
        }
        System.out.println("PAUSE");
    }

}
