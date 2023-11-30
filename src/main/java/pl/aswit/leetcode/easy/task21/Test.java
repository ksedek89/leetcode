package pl.aswit.leetcode.easy.task21;


import pl.aswit.leetcode.utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

        ListNode listNode4 = new ListNode(4);
        ListNode listNode2 = new ListNode(2, listNode4);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode listNode4a = new ListNode(4);
        ListNode listNode3 = new ListNode(3, listNode4a);
        ListNode listNode11 = new ListNode(1, listNode3);

        ListNode listNode8 = new ListNode(8);
        ListNode listNode0 = new ListNode(0, listNode8);
        ListNode listNode7 = new ListNode(7, listNode0);

        assertThat(solution.mergeTwoLists(listNode1, listNode11)).isNotNull();


    }

}
