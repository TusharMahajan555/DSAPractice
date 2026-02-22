package com.practice.linkedlist;


  class Node4
  {
    int data;
    Node4 next;

    Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

 public class DeleteInLinkedList  {

    // Function to delete a node at given position
    Node4 deleteAtPosition(Node4 head, int pos) {

        if (head == null) {
            return null;
        }

        // If head needs to be deleted
        if (pos == 1) {
            return head.next;
        }

        Node4 curr = head;
        int count = 1;

        // Traverse to the node just before the position
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }

        // If position is valid, delete node
        if (curr != null && curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }

    // Utility function to print list
    void printList(Node4 head) {
        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {

        DeleteInLinkedList obj = new DeleteInLinkedList();

        // Creating linked list: 1 -> 2 -> 3 -> 4
        Node4 head = new Node4(1);
        head.next = new Node4(2);
        head.next.next = new Node4(3);
        head.next.next.next = new Node4(4);

        System.out.println("Original List:");
        obj.printList(head);

        // Delete position 3
        head = obj.deleteAtPosition(head, 3);

        System.out.println("After deleting position 3:");
        obj.printList(head);
    }
}