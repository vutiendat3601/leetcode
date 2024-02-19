package tech.datvu.leetcode.shared.global;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Bussiness code

    public static void traverList(ListNode head) {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
    }

    public static ListNode insertAtHead(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    public static ListNode insertAtEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static ListNode removeAtEnd(ListNode head) {
        if (head == null) {
            return head;
        }

        if (head.next == null) {
            return null;
        }

        ListNode preNode = null;
        ListNode temp = head;
        while (temp.next != null) {
            preNode = temp;
            temp = temp.next;
        }
        preNode.next = null;
        return head;
    }

    public static ListNode createFromArray(int... nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[nums.length - 1], null);
        for (int i = nums.length - 2; i >= 0; i--) {
            ListNode newNode = new ListNode(nums[i]);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}