package pl.aswit.leetcode.hard.task25;




import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        ListNode listNode11 = new ListNode(11);
        ListNode listNode10 = new ListNode(10, listNode11);
        ListNode listNode9 = new ListNode(9, listNode10);
        ListNode listNode8 = new ListNode(8, listNode9);
        ListNode listNode7 = new ListNode(7, listNode8);
        ListNode listNode6 = new ListNode(6, listNode7);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);


        assertThat(solution.reverseKGroup(listNode1, 3)).isEqualTo(null);


    }


}


