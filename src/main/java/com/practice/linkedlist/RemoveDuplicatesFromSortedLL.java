package com.practice.linkedlist;

class Node7 {
    int data;
    Node7 next;

    Node7(int data) {
        this.data = data;
        this.next = null;
    }
}

class RemoveDuplicatesFromSortedLL {

    // Function to remove duplicates from sorted linked list
    Node7 removeDuplicates(Node7 head) {

        if (head == null) {
            return null;
        }

        Node7 curr = head;

        while (curr != null && curr.next != null) {

            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;   // remove duplicate
            } else {
                curr = curr.next;            // move forward
            }
        }

        return head;
    }

    // Utility function to print list
    void printList7(Node7 head) {
        Node7 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create object of SAME class
        RemoveDuplicatesFromSortedLL obj = new RemoveDuplicatesFromSortedLL();

        // Creating sorted linked list:
        // 1 -> 1 -> 2 -> 3 -> 3
        Node7 head = new Node7(1);
        head.next = new Node7(1);
        head.next.next = new Node7(2);
        head.next.next.next = new Node7(3);
        head.next.next.next.next = new Node7(3);

        System.out.println("Original List:");
        obj.printList7(head);

        head = obj.removeDuplicates(head);

        System.out.println("After Removing Duplicates:");
        obj.printList7(head);
    }
}