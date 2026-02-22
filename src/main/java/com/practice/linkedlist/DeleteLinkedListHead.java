package com.practice.linkedlist;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {

    // Delete head node
    public Node3 deleteHead(Node3 head) {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }

        return head.next;
    }

    // Helper method to print list
    public void printList(Node3 head) {
        Node3 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class DeleteLinkedListHead {
    public static void main(String[] args) {

        Node3 head = new Node3(10);
        head.next = new Node3(20);
        head.next.next = new Node3(30);
        head.next.next.next = new Node3(40);

        Solution sol = new Solution();

        System.out.println("Original List:");
        sol.printList(head);

        // Delete head
        head = sol.deleteHead(head);

        System.out.println("After Deleting Head:");
        sol.printList(head);
    }
}