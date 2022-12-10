package com.linkedlist;

public class LLInsertAtPos {

    ListNode inset(int data,ListNode head,int pos){
        ListNode toAdd= new ListNode(data);
        if(pos==0){
            toAdd.next=head;
            head=toAdd;
            return head;
        }

        ListNode prev = head;

        for(int i=0;i<pos-1;i++){
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;

        return prev;
    }

}
