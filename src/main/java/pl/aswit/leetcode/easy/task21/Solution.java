package pl.aswit.leetcode.easy.task21;


import pl.aswit.leetcode.utils.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode curr = temp;
        while (list1!= null || list2!=null){
            if(list1 == null){
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }else if(list2 == null){
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            }else if(list1.val < list2.val){
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            temp = temp.next;
        }
        return curr.next;
    }
}