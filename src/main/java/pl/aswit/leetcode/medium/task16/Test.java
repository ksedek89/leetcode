package pl.aswit.leetcode.medium.task16;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.threeSum(new int[] {-1,0,1,2,-1,-4})).isEqualTo(new int[][] {{-1,-1,2},{-1,0,1}});
//        assertThat(solution.threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4})).isEqualTo(new int[][] {{-4,0,4},{-4,1,3},{-3,-1,4},{-3,0,3},{-3,1,2},{-2,-1,3},{-2,0,2},{-1,-1,2},{-1,0,1}});


    }

}

