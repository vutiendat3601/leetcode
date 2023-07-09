package tech.datvu.leetcode;

public class Leetocde_02074ReverseNodesinEvenLengthGroups {

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

    public static ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode originHead = head;

        int iTh = 2;
        int cnt = 0;
        ListNode prev = head;
        while (head.next != null) {
            if (cnt == iTh) {
                if (iTh % 2 == 0) {
                    ListNode next = head.next;
                    head.next = null;
                    ListNode temp = prev.next;
                    prev.next = reverse(temp, null);
                    temp.next = next;
                    head = temp;
                    prev = temp;
                } else {
                    prev = head;
                }
                // reset
                iTh++;
                cnt = 0;
            }
            head = head.next;
            cnt++;
        }
        if (cnt % 2 == 0) {
            prev.next = reverse(prev.next, null);
        }
        return originHead;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 1, 1, 0, 6, 5 });
        ListNode.traverList(head);
        // head = reverse(head, null);
        head = reverseEvenLengthGroups(head);
        ListNode.traverList(head);

    }
}