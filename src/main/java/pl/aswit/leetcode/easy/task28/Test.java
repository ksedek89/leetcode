package pl.aswit.leetcode.easy.task28;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.strStr("leetcode", "leeto")).isEqualTo(-1);
        assertThat(solution.strStr("sadbutsad", "sad")).isEqualTo(0);
        assertThat(solution.strStr("hello", "ll")).isEqualTo(2);
        assertThat(solution.strStr("aaa", "aaaa")).isEqualTo(-1);

    }

}
