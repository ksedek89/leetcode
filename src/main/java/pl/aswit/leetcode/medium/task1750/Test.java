package pl.aswit.leetcode.medium.task1750;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

//
        assertThat(solution.minimumLength("cabaabac")).isEqualTo(0);
        assertThat(solution.minimumLength("aabccabba")).isEqualTo(3);
        assertThat(solution.minimumLength("bbbbbbbbbbbbbbbbbbb")).isEqualTo(0);

    }

}
