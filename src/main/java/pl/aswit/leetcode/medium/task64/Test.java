package pl.aswit.leetcode.medium.task64;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.minPathSum(new int[][] {{1,3,1}, {1,5,1},{4,2,1}})).isEqualTo(7);


    }

}
//