package pl.aswit.leetcode.easy.task2273;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"})).isEqualTo(List.of("abba","cd"));
        assertThat(solution.removeAnagrams(new String[]{"a","b","a"})).isEqualTo(List.of("a","b", "a"));
    }

}
