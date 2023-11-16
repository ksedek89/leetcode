package pl.aswit.leetcode.medium.task2;


public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int currSum = 0;

            if (l1 != null) {
                currSum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                currSum += l2.val;
                l2 = l2.next;
            }

            currSum += carry;
            carry = currSum / 10;
            currSum %= 10;

            curr.next = new ListNode(currSum);
            curr = curr.next;
        }

        return dummyNode.next;
    }

    //beats 6%
    public ListNode addTwoNumbersWeak(ListNode l1, ListNode l2) {

        ListNode temp = l1;
        StringBuilder sb = new StringBuilder();
        while (temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        String s1 = sb.toString();

        temp = l2;
        sb = new StringBuilder();
        while (temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        String s2 = sb.toString();
        sb = new StringBuilder();
        int rest = 0;
        for (int i = 0; i<s1.length() || i < s2.length(); i++){
            int s1Value = i < s1.length() ? Integer.parseInt(s1.substring(i, i+1)) : 0;
            int s2Value = i < s2.length() ? Integer.parseInt(s2.substring(i, i+1)) : 0;

            int result = s1Value + s2Value + rest;
            if(result > 9){
                sb.append(String.valueOf(result).substring(1, 2));
                rest = 1;
            }else{
                sb.append(result);
                rest = 0;
            }
        }
        if(rest == 1){
            sb.append(1);
        }

        String result = sb.toString();
        ListNode listNode = null;
        for(int i = result.length() - 1; i >= 0; i-- ){
            listNode = new ListNode(Integer.parseInt(result.substring(i, i+1)), listNode);
        }
        return listNode;
    }

    public ListNode addTwoNumbersWrong(ListNode l1, ListNode l2) {
        long l1Integer = 0, l2Integer = 0;
        long fact = 1;

        //count int1
        ListNode temp = l1;
        while (temp != null){
            l1Integer += fact * temp.val;
            temp = temp.next;
            fact *=10;
        }

        //count int2
        temp = l2;
        fact = 1;
        while (temp != null){
            l2Integer += fact * temp.val;
            temp = temp.next;
            fact *=10;
        }
        //count result
        long resultNotReversed = l1Integer + l2Integer;
        if(resultNotReversed == 0){
            return new ListNode(0);
        }

        long maxDivider = 1;

        long tempInt = resultNotReversed;
        while (tempInt > 0){
            maxDivider = maxDivider * 10;
            tempInt /= 10;
        }
        maxDivider = maxDivider/10;

        ListNode listNode = null;
        for(long i = maxDivider; i > 0; i /= 10 ){
            var rest = resultNotReversed/i % 10;
            listNode = new ListNode((int)rest, listNode);
        }
        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
