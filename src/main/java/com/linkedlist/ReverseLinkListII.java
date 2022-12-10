/*Problem Description
        Reverse a linked list A from position B to C.
        NOTE: Do it in-place and in one-pass.
        Problem Constraints
        1 <= |A| <= 106
        1 <= B <= C <= |A|
        Input Format
        The first argument contains a pointer to the head of the given linked list, A.
        The second arugment contains an integer, B.
        The third argument contains an integer C.
         Output Format
        Return a pointer to the head of the modified linked list.*/

package com.linkedlist;

public class ReverseLinkListII {

    public static ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode curr =A, prev=null;
        int i;
        for( i=1;i<B;i++){
           prev=curr;
           curr=curr.next;
        }

        ListNode rtail = curr;
        ListNode rhead=null;

        while(i<=C){
            ListNode next =curr.next;
            curr.next=rhead;
            rhead=curr;
            curr=next;
            i++;
        }

        if (prev != null)
            prev.next = rhead;
        else
            A = rhead;
        // at this point curr will point to the next of nth
        // node where we will connect the tail of the
        // reversed linked list
        rtail.next = curr;
        // at the end return the new head.
        return A;

    }


    public static void printList(ListNode head) {
        ListNode tnode = head;
        while (tnode != null) {
            System.out.print(tnode.val + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {

        ListNode first = new ListNode(10);
        ListNode seond = new ListNode(20);
        ListNode third = new ListNode(30);

        ListNode head=first;
        head.next=seond;
        head.next.next=third;
        printList(head);


    }

}
