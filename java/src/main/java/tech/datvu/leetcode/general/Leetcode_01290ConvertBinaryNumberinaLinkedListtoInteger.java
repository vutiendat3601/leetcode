package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_01290ConvertBinaryNumberinaLinkedListtoInteger {

    public static final int MAX_NODE = 30;

    public static int getDecimalValue(ListNode head) {
        int[] binVals = new int[MAX_NODE];

        int i = 0;
        int sum =0;
        while (head != null) {
            if (head.val != 0) {
                i++;
            }
            sum =0;
            for (int j = 0; j < i; j++) {
                binVals[j] = binVals[j] == 0 ? 1 : binVals[j] * 2;
                sum += binVals[j];
            }
            head = head.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Node fourth = new Node(9);
        ListNode third = new ListNode(1);
        ListNode second = new ListNode(0, third);
        ListNode head = new ListNode(1, second);
        System.out.println(getDecimalValue(head));
    }
}
