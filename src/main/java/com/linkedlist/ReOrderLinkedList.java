package com.linkedlist;

public class ReOrderLinkedList {

     ListNode  reverse(ListNode head){
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

    public ListNode reorderList(ListNode A) {
         ListNode slow=A;
         ListNode fast=A;
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }

         ListNode node1=A;
         ListNode node2=(reverse(slow.next));
         slow.next=null;

         A= new ListNode(0);
         ListNode curr=A;

         while(node1 !=null || node2 !=null){

             if(node1!=null){
                 curr.next=node1;
                 curr=curr.next;
                 node1=node1.next;
             }

             if(node2!=null){
                 curr.next=node2;
                 curr=curr.next;
                 node2=node2.next;
             }
         }
         A=A.next;
        return A;
    }
}
