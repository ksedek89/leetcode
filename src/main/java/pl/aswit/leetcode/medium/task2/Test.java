package pl.aswit.leetcode.medium.task2;


import pl.aswit.leetcode.utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4, listNode3);
        ListNode listNode2 = new ListNode(2, listNode4);

        ListNode listNode4a = new ListNode(4);
        ListNode listNode6 = new ListNode(6, listNode4a);
        ListNode listNode5 = new ListNode(5, listNode6);

        ListNode listNode8 = new ListNode(8);
        ListNode listNode0 = new ListNode(0, listNode8);
        ListNode listNode7 = new ListNode(7, listNode0);

        assertThat(solution.addTwoNumbers(listNode2, listNode5)).isEqualTo(listNode7);


/*        ListNode listNode9 = new ListNode(9);
        ListNode listNode99 = new ListNode(9, listNode9);
        ListNode listNode999 = new ListNode(9,listNode99 );
        ListNode listNode9999 = new ListNode(9, listNode999);
        ListNode listNode99999 = new ListNode(9, listNode9999);
        ListNode listNode999999 = new ListNode(9, listNode99999);
        ListNode listNode9999999 = new ListNode(9, listNode999999);


        assertThat(solution.addTwoNumbers(listNode9999999, listNode9999)).isEqualTo(listNode9);*/


//        assertThat(solution.addTwoNumbers(new ListNode(0), new ListNode(0))).isEqualTo(new ListNode(0));

/*        ListNode listNode6 = new ListNode(6);
        ListNode listNode5 = new ListNode(5, listNode6);

        ListNode listNode9 = new ListNode(9);
        ListNode listNode4 = new ListNode(4, listNode9);
        ListNode listNode55 = new ListNode(5, listNode4);

        ListNode listNode1 = new ListNode(1);
        ListNode listNode0 = new ListNode(0, listNode1);
        ListNode listNode11 = new ListNode(1, listNode0);
        ListNode listNode00 = new ListNode(0, listNode11);

        assertThat(solution.addTwoNumbers(listNode5, listNode55)).isEqualTo(listNode00);*/

/*        ListNode listNode9 = new ListNode(9);
        ListNode listNode99 = new ListNode(9, listNode9);
        ListNode listNode999 = new ListNode(9, listNode99);
        ListNode listNode9999 = new ListNode(9, listNode999);
        ListNode listNode99999 = new ListNode(9, listNode9999);
        ListNode listNode999999 = new ListNode(9, listNode99999);
        ListNode listNode9999999 = new ListNode(9, listNode999999);
        ListNode listNode99999999 = new ListNode(9, listNode9999999);
        ListNode listNode999999999 = new ListNode(9, listNode99999999);
        ListNode listNode9999999999 = new ListNode(9, listNode999999999);

        ListNode listNode1 = new ListNode(1, listNode9999999999);

        assertThat(solution.addTwoNumbers(listNode9, listNode1)).isEqualTo(listNode9);*/

    }

}
