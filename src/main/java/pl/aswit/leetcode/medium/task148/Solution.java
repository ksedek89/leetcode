package pl.aswit.leetcode.medium.task148;

import pl.aswit.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public ListNode sortList(ListNode head) {

        PriorityQueue<ListNode> p = new PriorityQueue<>((o1, o2) -> ((Integer)o1.val).compareTo(o2.val));

        while(head!= null){
            p.add(head);
            head = head.next;
        }
        System.out.println("Jkl");

        ListNode newHead = p.poll();
        ListNode current = newHead;
        while(!p.isEmpty()){
            current.next = p.poll();
            current = current.next;
        }

        if(current!= null){
            current.next = null;
        }

        return newHead;

    }
}


