package pl.aswit.leetcode.task1317;


import static org.assertj.core.api.Assertions.assertThat;

public class Test1317 {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.getNoZeroIntegers(2)).isEqualTo(new int[]{1,1});
        assertThat(solution.getNoZeroIntegers(10000)).isEqualTo(new int[]{1,9999});
    }
}
