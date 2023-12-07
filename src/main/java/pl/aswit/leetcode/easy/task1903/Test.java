package pl.aswit.leetcode.easy.task1903;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.largestOddNumber("4206")).isEqualTo("");
        assertThat(solution.largestOddNumber("35427")).isEqualTo("35427");
    }

}
