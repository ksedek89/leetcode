package pl.aswit.leetcode.medium.task159;


import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("eceba")).isEqualTo(3);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("ccaabbb")).isEqualTo(5);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("a")).isEqualTo(1);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("ab")).isEqualTo(2);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("aac")).isEqualTo(3);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("aa")).isEqualTo(2);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("abaccc")).isEqualTo(4);
        assertThat(solution.lengthOfLongestSubstringTwoDistinct("ababacccccc")).isEqualTo(7);

    }

}
//