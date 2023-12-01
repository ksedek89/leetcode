package pl.aswit.leetcode.easy.task1099;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
//        assertThat(solution.twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60)).isEqualTo(58);
        assertThat(solution.twoSumLessThanK(new int[]{100}, 200)).isEqualTo(58);
    }
}
