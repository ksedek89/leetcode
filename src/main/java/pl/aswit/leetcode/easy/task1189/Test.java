package pl.aswit.leetcode.easy.task1189;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.maxNumberOfBalloons("nlaebolko")).isEqualTo(1);
    }
}
