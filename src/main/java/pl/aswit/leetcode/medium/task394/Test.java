package pl.aswit.leetcode.medium.task394;


import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.decodeString("2[abc]3[cd]ef")).isEqualTo("abcabccdcdcdef");

    }

}
