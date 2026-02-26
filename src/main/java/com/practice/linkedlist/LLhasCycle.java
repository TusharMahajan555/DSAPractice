package com.practice.linkedlist;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
        next = null;
    }
}

public class LLhasCycle {

    public boolean hasCycle(ListNode1 head) {

        if (head == null) return false;

        ListNode1 slow = head;
        ListNode1 fast = head;

        // Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {

            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        LLhasCycle sol = new LLhasCycle();

        // Creating nodes
        ListNode1 node1 = new ListNode1(1);
        ListNode1 node2 = new ListNode1(2);
        ListNode1 node3 = new ListNode1(3);
        ListNode1 node4 = new ListNode1(4);

        // Connecting nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Creating a cycle (node4 points back to node2)
        node4.next = node2;

        boolean result = sol.hasCycle(node1);

        System.out.println("Does Linked List have cycle? " + result);
    }
}