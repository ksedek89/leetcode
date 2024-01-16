package pl.aswit.leetcode.medium.task12;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.intToRoman(1994)).isEqualTo("MCMXCIV");

    }

}
