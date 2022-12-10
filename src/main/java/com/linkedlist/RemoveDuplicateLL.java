package com.linkedlist;

public class RemoveDuplicateLL {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head = A;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                head.next= head.next.next;
            }else{
                head= head.next;
            }
        }

        return A;
    }
}
