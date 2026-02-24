package com.practice.linkedlist;

// Definition of node14 class
class node14 {
    int data;
    node14 next;

    node14(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SumOfNodes {

    // Function to calculate sum of elements
    public static int sumOfElements(node14 head) {

        int sum = 0;

        while (head != null) {
            sum = sum + head.data;
            head = head.next;
        }

        return sum;
    }

    // Main function
    public static void main(String[] args) {

        // Creating linked list: 5 -> 10 -> 15 -> 20
        node14 head = new node14(5);
        head.next = new node14(10);
        head.next.next = new node14(15);
        head.next.next.next = new node14(20);

        int result = sumOfElements(head);

        System.out.println("Sum of elements = " + result);
    }
}