package com.practice.linkedlist;

public class ReverseLL {

    // Node class named node15
    static class node15 {
        int data;
        node15 next;

        node15(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse linked list
    public static node15 reverse(node15 head) {
        node15 prev = null;
        node15 current = head;
        node15 next = null;

        while (current != null) {
            next = current.next;   // store next node
            current.next = prev;  // reverse link
            prev = current;       // move prev forward
            current = next;       // move current forward
        }

        return prev; // new head
    }

    // Method to print linked list
    public static void printList(node15 head) {
        node15 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {

        node15 head = new node15(1);
        head.next = new node15(2);
        head.next.next = new node15(3);
        head.next.next.next = new node15(4);

        System.out.println("Original List:");
        printList(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}