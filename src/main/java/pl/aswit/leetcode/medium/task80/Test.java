package pl.aswit.leetcode.medium.task80;


import pl.aswit.leetcode.utils.ListNode;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();


        assertThat(solution.removeDuplicates(new int[]{1,1,1,2,2,3})).isEqualTo(5);


    }

}

