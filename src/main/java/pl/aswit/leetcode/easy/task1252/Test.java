package pl.aswit.leetcode.easy.task1252;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.oddCells(2,3, new int[][]{{0,1},{1,1}})).isEqualTo(6);
    }
}
