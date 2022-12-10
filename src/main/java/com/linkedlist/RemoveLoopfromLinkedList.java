package com.linkedlist;

import java.util.HashSet;

public class RemoveLoopfromLinkedList {

    public ListNode solve(ListNode A) {

        if(A==null && A.next==null) return null;

        ListNode slow = A;
        ListNode fast = A;
        slow=slow.next;
        fast=fast.next.next;

        while(fast !=null && fast.next!=null){

            if(slow==fast) break;
            slow=slow.next;
            fast=fast.next.next;
        }

        if(slow==fast){

            slow=A;
             while(slow.next != fast.next){
                 slow=slow.next;
                 fast=fast.next.next;
             }

             fast.next=null;
        }

        return A;
    }

    boolean removeloop(ListNode head){
        HashSet<ListNode> s = new HashSet<ListNode>();
        ListNode prev = null;

        while(head!=null) {

            if (s.contains(head)) {
                prev.next = null;
                return true;
            } else {
                s.add(head);
                prev = head;
                head = head.next;
            }
        }

        return false;
    }
}
