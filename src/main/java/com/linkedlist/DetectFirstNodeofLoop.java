package com.linkedlist;

public class DetectFirstNodeofLoop {

    public ListNode detectCycle(ListNode a) {

        ListNode meet = checkloopOrNot(a);
        if(meet==null) return null;
        ListNode start = a;

        while(start!=meet){
            start = start.next;
            meet= meet.next;
        }
        return start;
    }

    public  ListNode checkloopOrNot(ListNode a){
        ListNode slow =a;
        ListNode fast =a;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast) return slow;
        }
        return null;
    }
}
