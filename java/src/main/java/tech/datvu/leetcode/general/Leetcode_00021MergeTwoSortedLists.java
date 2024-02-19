package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00021MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }

        ListNode res = new ListNode();
        ListNode origin = res;

        while (list1 != null && list2 != null) {
            ListNode temp = null;
            if (list1.val < list2.val) {
                temp = list1;
                list1 = list1.next;
                res.next = temp;
            } else {
                temp = list2;
                list2 = list2.next;
            }
            temp.next = null;
            res.next = temp;
            res=res.next;
        }

        if (list1 != null) {
            res.next = list1;
        }

        if (list2 != null) {
            res.next = list2;
        }
        return origin.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.createFromArray(new int[] { 1, 2, 4 });
        ListNode l2 = ListNode.createFromArray(new int[] { 1, 3, 4 });
        ListNode res = mergeTwoLists(l1, l2);
        ListNode.traverList(res);
    }
}
