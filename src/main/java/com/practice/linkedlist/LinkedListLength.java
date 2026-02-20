package com.practice.linkedlist;


public class LinkedListLength
{

    static class Node1{

        int data;
        Node1 next;

        Node1(int x)
        {
            data=x;
            next=null;
        }

    }

    public static void main(String[] args)
    {

        Node1 head=new Node1(10);
        Node1 head1=new Node1(20);
        Node1 head2=new Node1(30);
        Node1 head3=new Node1(40);
        Node1 head4=new Node1(50);
        Node1 head5=new Node1(50);


        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;


        int count=0;

        while(head!=null)
        {
           count++;
           head=head.next;
        }

        System.out.println("Length of Linked List is "+count);

    }
}