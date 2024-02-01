package pl.aswit.leetcode.medium.task148;


import pl.aswit.leetcode.utils.ListNode;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();


        ListNode listNode3 = new ListNode(3);
        ListNode listNode1 = new ListNode(1, listNode3);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode4 = new ListNode(4, listNode2);
        assertThat(solution.sortList(listNode4)).isEqualTo(0);

    }

}
