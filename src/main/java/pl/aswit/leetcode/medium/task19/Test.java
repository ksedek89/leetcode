package pl.aswit.leetcode.medium.task19;


import pl.aswit.leetcode.utils.ListNode;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();


        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode listNode = solution.removeNthFromEnd(listNode4, 2);
        System.out.println();
//        assertThat(solution.removeNthFromEnd(listNode1, 2)).isEqualTo(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});


    }

}

