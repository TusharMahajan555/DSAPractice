package com.practice.linkedlist;

class node6 {
    int data;
    node6 next;

    node6(int data) {
        this.data = data;
        this.next = null;
    }

    // Function to check if linked list is sorted
    public static boolean LinkedListIsSorted(node6 head) {

        // Empty list or single node is always sorted
        if (head == null || head.next == null) {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        node6 curr = head;

        while (curr != null && curr.next != null) {

            if (curr.data > curr.next.data) {
                increasing = false;
            }

            if (curr.data < curr.next.data) {
                decreasing = false;
            }

            curr = curr.next;
        }

        return increasing || decreasing;
    }

    // Utility method to print list
    public static void printList(node6 head) {
        node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        node6 head = new node6(1);
        head.next = new node6(2);
        head.next.next = new node6(3);
        head.next.next.next = new node6(4);

        printList(head);

        if (LinkedListIsSorted(head)) {
            System.out.println("Linked List is Sorted");
        } else {
            System.out.println("Linked List is NOT Sorted");
        }
    }
}
