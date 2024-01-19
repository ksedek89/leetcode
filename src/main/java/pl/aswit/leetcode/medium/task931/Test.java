package pl.aswit.leetcode.medium.task931;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.knightDialer(1)).isEqualTo(10);
//        assertThat(solution.knightDialer(2)).isEqualTo(20);
        assertThat(solution.minFallingPathSum(new int[][] {{2,1,3},{6,5,4},{7,8,9}})).isEqualTo(13);


    }

}
