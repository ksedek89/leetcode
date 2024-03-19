package pl.aswit.leetcode.hard.task25;



public class Solution {

    public ListNode reverseKGroup(ListNode<Integer> l, int k) {
        if(k == 1){
            return l;
        }
        int size = 0;
        ListNode<Integer> t = l;
        while(t!= null){
            size++;
            t = t.next;
        }
        int numberOfKs = size / k;
        System.out.println("Size:" + size);
        System.out.println("No of ks: " + numberOfKs);

        ListNode<Integer> dummy = new ListNode<Integer>(-1);
        ListNode<Integer> tail = null;
        for (int i = 0; i < numberOfKs; i++) {
            ListNode<Integer> firstFromGroup = l;
            ListNode<Integer> prev = firstFromGroup;
            l = l.next;
            for (int j = 1; j < k; j++) {
                ListNode<Integer> current = l;
                l = l.next;
                current.next = prev;
                prev = current;
            }
            firstFromGroup.next = l;
            if(dummy.next == null){
                dummy.next = prev;
            }
            if(tail!= null){
                tail.next = prev;
            }
            tail = firstFromGroup;

        }

        tail.next = l;

        ListNode<Integer> sdfdc = dummy.next;
        while(sdfdc != null){
            System.out.print(sdfdc.value + " ");
            sdfdc = sdfdc.next;
        }

        return dummy.next;
    }
}
