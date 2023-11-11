package pl.aswit.leetcode.task1967;


import static org.assertj.core.api.Assertions.assertThat;

public class Test1967 {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.numOfStrings(new String[]{"a","abc","bc","d"}, "abc")).isEqualTo(3);
        assertThat(solution.numOfStrings(new String[]{"a","b","c"}, "aaaaabbbbb")).isEqualTo(2);
        assertThat(solution.numOfStrings(new String[]{"a","a","a"}, "ab")).isEqualTo(3);
    }

}
