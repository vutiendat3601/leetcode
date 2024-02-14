package tech.datvu.leetcode.general;
public class Leetcode_00092ReverseLinkedListII {

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

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        int cnt = 1;
        ListNode beforeHead = new ListNode(-101, head);
        ListNode prevNode = beforeHead;
        while (head != null) {
            if (cnt == left) {
                break;
            }
            prevNode = head;
            head = head.next;
            cnt++;
        }
        ListNode l = prevNode;
        while (head != null) {
            if (cnt == right+1) {
                break;
            }
            prevNode = head;
            head = head.next;
            cnt++;
        }
        prevNode.next = null;
        prevNode = l.next;
        l.next = reverse(l.next, null);
        prevNode.next = head;
        // prevNode.next = reverse(prevNode.next, null);

        return beforeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 2, 3, 4, 5 });
        // head = reverse(head, null);
        head = reverseBetween(head, 2, 4);
        ListNode.traverList(head);
    }
}
