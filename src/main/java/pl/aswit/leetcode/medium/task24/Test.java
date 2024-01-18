package pl.aswit.leetcode.medium.task24;


import pl.aswit.leetcode.utils.ListNode;

import java.io.IOException;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();


        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode listNode = solution.swapPairs(listNode1);
        System.out.println();
//        assertThat(solution.removeNthFromEnd(listNode1, 2)).isEqualTo(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});


    }

}

