package pl.aswit.leetcode.medium.task624;


import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.maxDistance(Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5), Arrays.asList(1,2,3)))).isEqualTo(4);
//        assertThat(solution.maxDistance(Arrays.asList(Arrays.asList(1,4), Arrays.asList(0,5)))).isEqualTo(4);

    }

}
