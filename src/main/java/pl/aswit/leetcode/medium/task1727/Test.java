package pl.aswit.leetcode.medium.task1727;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.largestSubmatrix(new int[][]{{0,0,1},{1,1,1},{1,0,1}})).isEqualTo(4);
        assertThat(solution.largestSubmatrix(new int[][]{{1,0,1,0,1}})).isEqualTo(4);

    }

}
