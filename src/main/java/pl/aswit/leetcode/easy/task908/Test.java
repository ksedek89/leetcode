package pl.aswit.leetcode.easy.task908;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.smallestRangeI(new int[]{1,3,6}, 3)).isEqualTo(0);
        assertThat(solution.smallestRangeI(new int[]{0,10}, 2)).isEqualTo(6);
        assertThat(solution.smallestRangeI(new int[]{1}, 0)).isEqualTo(0);
    }
}
