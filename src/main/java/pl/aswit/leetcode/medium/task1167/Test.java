package pl.aswit.leetcode.medium.task1167;


import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.connectSticks(new int[]{1,8,3,5})).isEqualTo(30);

    }

}
