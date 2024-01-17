package pl.aswit.leetcode.medium.task19;

import pl.aswit.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head;
        int size = 1;
        while(a.next != null){
            a = a.next;
            size++;
        }
        int element = size - n + 1;

        a = head;

        int counter = 1;
        if(element == 1){
            return head.next;
        }
        while (counter <= element){
            if(counter == element - 1){
                a.next = a.next.next != null ? a.next.next: null;
                return head;
            }else{
                a = a.next;
            }
            counter++;
        }
        return null;

    }


}


