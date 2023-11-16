package pl.aswit.leetcode.medium.task3;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
        assertThat(solution.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
        assertThat(solution.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);


    }

}
