package pl.aswit.leetcode.medium.task24;

import pl.aswit.leetcode.utils.ListNode;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode top = head.next != null ? head.next : head;

        ListNode cur1 = head;
        ListNode cur2 = head.next;
        ListNode lastTop = null;


        while (cur2!=null && cur1!=null){
        cur1.next = cur2.next;
        cur2.next = cur1;
        if(lastTop!=null){
            lastTop.next = cur2;
        }


        lastTop = cur1;


        cur1 = cur1.next;
        if(cur1!= null){
            cur2 = cur1.next;
        }


        }

        return top;
    }

}


