package com.linkedlist;


public class DeleteLLMiddle {
    public ListNode solve(ListNode A) {

        if (A == null)
            return null;
        if (A.next == null) {
            return null;
        }

        ListNode slow_ptr = A;
        ListNode fast_ptr = A;

        // Find the middle and previous of middle.
        ListNode prev = null;

        // To store previous of slow_ptr
        while (fast_ptr != null
                && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }

        // Delete the middle node
        prev.next = slow_ptr.next;

        return A;

    }
}
