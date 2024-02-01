package pl.aswit.leetcode.easy.task83;


import pl.aswit.leetcode.utils.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode currElement = head;
        while(currElement != null){
            ListNode nextElement = currElement.next;
            if(nextElement != null && currElement.val == nextElement.val){
                currElement.next = nextElement.next;
            }else{
                currElement = nextElement;
            }
        }

        return head;
    }
}

