package pl.aswit.leetcode.easy.task2299;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.strongPasswordCheckerII("IloveLe3tcode!")).isEqualTo(true);
//        assertThat(solution.strongPasswordCheckerII("Me+You--IsMyDream")).isEqualTo(false);
//        assertThat(solution.strongPasswordCheckerII("1aB!")).isEqualTo(false);
        assertThat(solution.strongPasswordCheckerII("11A!A!Aa")).isEqualTo(false);
    }

}
