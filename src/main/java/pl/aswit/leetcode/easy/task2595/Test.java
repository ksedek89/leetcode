package pl.aswit.leetcode.easy.task2595;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.evenOddBit(17)).isEqualTo(new int[]{2,0});
        assertThat(solution.evenOddBit(2)).isEqualTo(new int[]{0,1});
    }

}
