package com.practice.linkedlist;

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
        this.next = null;
    }
}

class InsertAtPos {

    // Insert at given position (1-based indexing)
    static Node12 insertAtPosition(Node12 head, int pos, int data) {

        Node12 newNode = new Node12(data);

        // If inserting at position 1 (beginning)
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node12 curr = head;
        int count = 1;

        // Move to (pos-1)th node
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }

        // If position is invalid
        if (curr == null) {
            System.out.println("Invalid Position");
            return head;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    // Print Linked List
    static void printList(Node12 head) {
        Node12 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        Node12 head = new Node12(10);
        head.next = new Node12(20);
        head.next.next = new Node12(30);
        head.next.next.next = new Node12(40);

        System.out.println("Original List:");
        printList(head);

        head = insertAtPosition(head, 3, 25);

        System.out.println("After Inserting 25 at Position 3:");
        printList(head);
    }
}