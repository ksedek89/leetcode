package pl.aswit.leetcode.medium.task5;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.longestPalindrome("babad")).isEqualTo("bab");
        assertThat(solution.longestPalindrome("cbbd")).isEqualTo("bb");
        assertThat(solution.longestPalindrome("tattarrattat")).isEqualTo("tattarrattat");

    }

}