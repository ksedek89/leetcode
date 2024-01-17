package pl.aswit.leetcode.easy.task1207;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3})).isEqualTo(true);
    }
}
