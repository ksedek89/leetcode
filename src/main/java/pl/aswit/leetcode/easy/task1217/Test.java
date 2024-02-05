package pl.aswit.leetcode.easy.task1217;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.minCostToMoveChips(new int[]{2,2,2,3,3})).isEqualTo(2);
    }
}
