package tech.datvu.leetcode.general;

import tech.datvu.leetcode.shared.global.ListNode;

public class Leetcode_00707DesignLinkedList {

    private ListNode head;
    private ListNode tail;
    public int size;

    public Leetcode_00707DesignLinkedList() {
        size =0;
        head = new ListNode();
        head = null;
        tail = new ListNode();
        tail = null;
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        if (index >= size) {
            return -1;
        }
        int i = 0;
        ListNode node = head;
        while (i < index) {
            node = node.next;
            i++;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        if (head == null) {
            ListNode node = new ListNode();
            node.val = val;
            head = node;
            tail = node;
            size++;
            return;
        }
        ListNode node = new ListNode();
        node.val = val;
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            ListNode node = new ListNode();
            node.val = val;
            head = node;
            tail = node;
            size++;
            return;
        }
        ListNode node = new ListNode();
        node.val = val;
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        int i = 0;
        ListNode temp_node = head;
        ListNode prev_node = head;
        ListNode node = new ListNode();
        node.val = val;
        while (i != index) {
            prev_node = temp_node;
            temp_node = temp_node.next;
            i++;
        }
        prev_node.next = node;
        node.next = temp_node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        int i = 0;
        ListNode temp_node = head;
        ListNode prev_node = head;
        while (i != index) {
            prev_node = temp_node;
            temp_node = temp_node.next;
            i++;
        }
        if (i == 0) {
            head = head.next;
            return;
        }
        size--;
        if (temp_node == tail) {
            tail = prev_node;
            tail.next = null;
            return;
        }
        prev_node.next = temp_node.next;
        temp_node = null;
    }

    public static void main(String[] args) {

    }
}
