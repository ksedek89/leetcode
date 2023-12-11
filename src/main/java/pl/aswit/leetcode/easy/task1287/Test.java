package pl.aswit.leetcode.easy.task1287;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
//        assertThat(solution.findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10})).isEqualTo(6);
        assertThat(solution.findSpecialInteger(new int[]{1})).isEqualTo(1);
    }
}
