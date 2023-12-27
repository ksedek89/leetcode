package pl.aswit.leetcode.medium.task7;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

//        assertThat(solution.reverse(1534236469)).isEqualTo(0);
        assertThat(solution.reverse(2147483647)).isEqualTo(0);

    }

}
