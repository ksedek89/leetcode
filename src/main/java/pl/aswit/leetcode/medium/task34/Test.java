package pl.aswit.leetcode.medium.task34;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

        assertThat(solution.searchRange(new int[] {5,7,7,8,8,10}, 8)).isEqualTo(new int[] {3,4});

    }

}
