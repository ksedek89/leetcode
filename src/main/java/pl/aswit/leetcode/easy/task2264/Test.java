package pl.aswit.leetcode.easy.task2264;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.largestGoodInteger("6777133339")).isEqualTo("777");
    }

}
