package pl.aswit.leetcode.easy.task2639;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.findColumnWidth(new int[][]{{1},{22},{333}})).isEqualTo(new int[]{3});
        assertThat(solution.findColumnWidth(new int[][]{{-15,1,3},{15,7,12},{5,6,-2}})).isEqualTo(new int[]{3,1,2});
    }

}
