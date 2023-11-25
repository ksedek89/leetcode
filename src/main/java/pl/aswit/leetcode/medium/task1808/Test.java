package pl.aswit.leetcode.medium.task1808;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.getSumAbsoluteDifferences(new int[]{1,4,6,8,10})).isEqualTo(new int[]{24,15,13,15,21});

    }

}
