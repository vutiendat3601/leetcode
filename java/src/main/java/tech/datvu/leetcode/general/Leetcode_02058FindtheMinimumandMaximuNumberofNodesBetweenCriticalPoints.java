package tech.datvu.leetcode.general;

import java.util.Arrays;

public class Leetcode_02058FindtheMinimumandMaximuNumberofNodesBetweenCriticalPoints {

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2];
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MIN_VALUE;

        ListNode prev = head;
        ListNode f = head.next;
        int fCP = -1;
        int cnt = 1;
        while (f != null && f.next != null) {
            if ((f.val < prev.val && f.val < f.next.val) || (f.val > prev.val && f.val > f.next.val)) {
                fCP = cnt;
                prev = f;
                f = f.next;
                cnt++;
                break;
            }
            prev = f;
            f = f.next;
            cnt++;
        }

        int prevCP = fCP;
        while (f != null && f.next != null) {
            if ((f.val < prev.val && f.val < f.next.val) || (f.val > prev.val && f.val > f.next.val)) {
                res[0] = Math.min(res[0], cnt - prevCP);
                prevCP = cnt;
            }
            prev = f;
            f = f.next;
            cnt++;
        }
        if (prevCP == fCP) {
            return new int[] { -1, -1 };
        }
        res[1] = prevCP - fCP;
        return res;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createFromArray(new int[] { 4, 2, 4, 1 });
        int[] res = nodesBetweenCriticalPoints(head);
        System.out.println(Arrays.toString(res));
    }
}
