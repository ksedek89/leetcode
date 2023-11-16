package pl.aswit.leetcode.easy.task2843;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.countSymmetricIntegers(1,100)).isEqualTo(9);
        assertThat(solution.countSymmetricIntegers(1200,1230)).isEqualTo(4);
    }

}
