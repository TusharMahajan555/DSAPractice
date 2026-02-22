package com.practice.linkedlist;
class Node8 {
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;
        this.next = null;
    }
}

class identicalLL {

    public boolean areIdentical8(Node8 head1, Node8 head2) {

        while (head1 != null && head2 != null) {

            if (head1.data != head2.data) {
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;
        }

        return (head1 == null && head2 == null);
    }

    // Utility method to print list
    public void printList8(Node8 head) {
        Node8 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        identicalLL obj = new identicalLL();

        // First linked list: 1 -> 2 -> 3
        Node8 head1 = new Node8(1);
        head1.next = new Node8(2);
        head1.next.next = new Node8(3);

        // Second linked list: 1 -> 2 -> 3
        Node8 head2 = new Node8(1);
        head2.next = new Node8(2);
        head2.next.next = new Node8(3);

        System.out.println("List 1:");
        obj.printList8(head1);

        System.out.println("List 2:");
        obj.printList8(head2);

        if (obj.areIdentical8(head1, head2)) {
            System.out.println("Both Linked Lists are Identical");
        } else {
            System.out.println("Linked Lists are NOT Identical");
        }
    }
}