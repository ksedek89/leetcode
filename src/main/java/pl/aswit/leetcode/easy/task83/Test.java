package pl.aswit.leetcode.easy.task83;


import pl.aswit.leetcode.utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

        ListNode listNode2 = new ListNode(1);
        ListNode listNode11 = new ListNode(1, listNode2);
        ListNode listNode1 = new ListNode(1, listNode11);
        assertThat(solution.deleteDuplicates(listNode1)).isEqualTo(5);

    }

}
