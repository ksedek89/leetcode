package pl.aswit.leetcode.easy.task2500;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}})).isEqualTo(8);
    }

}
