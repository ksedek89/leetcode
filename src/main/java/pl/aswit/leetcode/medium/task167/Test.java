package pl.aswit.leetcode.medium.task167;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.twoSum(new int[]{2,7,11,15}, 9)).isEqualTo(new int[] {1,2});


    }

}
