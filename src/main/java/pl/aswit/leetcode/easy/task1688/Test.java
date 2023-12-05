package pl.aswit.leetcode.easy.task1688;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.numberOfMatches(7)).isEqualTo(6);
        assertThat(solution.numberOfMatches(14)).isEqualTo(13);
    }
}
