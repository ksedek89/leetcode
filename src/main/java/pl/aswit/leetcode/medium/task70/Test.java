package pl.aswit.leetcode.medium.task70;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.climbStairs(5)).isEqualTo(1134903170);

    }

}