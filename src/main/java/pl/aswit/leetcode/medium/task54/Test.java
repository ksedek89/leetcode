package pl.aswit.leetcode.medium.task54;


import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

//        assertThat(solution.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}})).isEqualTo(List.of(1,2,3,4,8,12,11,10,9,5,6,7));
        assertThat(solution.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}})).isEqualTo(List.of(1,2,3,4,8,12,11,10,9,5,6,7));

    }

}
