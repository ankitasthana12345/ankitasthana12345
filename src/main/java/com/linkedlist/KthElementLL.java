package com.linkedlist;


public class KthElementLL {

    public  static int findKthElement(ListNode head, int k){

        ListNode temp = head;

        while (temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        if(temp!=null){
            return temp.val;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };
        ListNode head =null;
        for (int i = keys.length-1;i>=0;i--){
            head = new ListNode(keys[i]);
        }

        int ans = findKthElement(head,2);
        System.out.println(ans);
    }
}
