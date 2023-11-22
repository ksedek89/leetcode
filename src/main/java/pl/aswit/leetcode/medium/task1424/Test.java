package pl.aswit.leetcode.medium.task1424;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.findDiagonalOrder(Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9)))).isEqualTo(new int[]{1,4,2,7,5,3,8,6,9});
//        assertThat(solution.findDiagonalOrder(Arrays.asList(Arrays.asList(1,2,3,4,5), Arrays.asList(6,7), Arrays.asList(8), Arrays.asList(9,10,11), Arrays.asList(12,13,14,15,16)))).isEqualTo(new int[]{1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16});

//        assertThat(solution.findDiagonalOrder().isEqualTo(new int[]{1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16});


    }

}
