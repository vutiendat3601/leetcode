package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00725SplitLinkedListinParts {

    public static int size(ListNode head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        int len = size(head);

        int r = len % k;
        int lenOfGr = len / k;
        int i = 0;

        int cnt = 0;
        ListNode prev = new ListNode(-101, head);
        head = prev;
        while (head != null) {
            if (cnt == lenOfGr) {
                res[i++] = prev.next;
                if (i == k) {
                    break;
                }
                if (r > 0) {
                    head = head.next;
                    r--;
                }
                prev.next = head.next;
                head.next = null;
                head = prev;
                cnt = 0;
            } else {
                head = head.next;
                cnt++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] {});
        int k = 3;
        splitListToParts(head, k);
    }
}
