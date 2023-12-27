package pl.aswit.leetcode.medium.task8;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.myAtoi("42")).isEqualTo(42);
        assertThat(solution.myAtoi("   -42")).isEqualTo(-42);
        assertThat(solution.myAtoi("4193 with words")).isEqualTo(4193);
        assertThat(solution.myAtoi("words and 987")).isEqualTo(0);
        assertThat(solution.myAtoi("-91283472332")).isEqualTo(Integer.MIN_VALUE);
        assertThat(solution.myAtoi("20000000000000000000")).isEqualTo(2147483647);
        assertThat(solution.myAtoi("-5-")).isEqualTo(-5);
        assertThat(solution.myAtoi("3.14159")).isEqualTo(3);
        assertThat(solution.myAtoi("+-12")).isEqualTo(0);
        assertThat(solution.myAtoi("123-")).isEqualTo(123);
        assertThat(solution.myAtoi("3-5")).isEqualTo(3);

    }

}
