package com.practice.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode hh = null;
        ListNode ht = null;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                if (hh == null) {
                    hh = list1;
                    ht = list1;
                } else {
                    ht.next = list1;
                    ht = ht.next;
                }

                list1 = list1.next;

            } else {

                if (hh == null) {
                    hh = list2;
                    ht = list2;
                } else {
                    ht.next = list2;
                    ht = ht.next;
                }

                list2 = list2.next;
            }
        }

        if (list1 != null) {
            ht.next = list1;
        } else if (list2 != null) {
            ht.next = list2;
        }

        return hh;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        MergeTwoLinkedList sol = new MergeTwoLinkedList();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(merged);
    }
}