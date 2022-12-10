package com.linkedlist;

public class ReverseLinkList {

    static ListNode  reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
    }

    public static ListNode revrec(ListNode head){
        if(head == null || head.next ==null) return head;

        ListNode newHead = revrec(head.next);
        ListNode headnext = head.next;
        headnext.next=head;
        head.next=null;
        return newHead;
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
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);

        ListNode head=first;
        head.next=second;
        second.next=third;
        third.next=null;
        printList(head);
        System.out.println("=======Reveser========");
        ListNode rev = revrec(head);
        printList(rev);


    }

}
