package pl.aswit.leetcode.task1021;


import static org.assertj.core.api.Assertions.assertThat;

public class Test1021 {

    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.removeOuterParentheses("(()())(())")).isEqualTo("()()()");
        assertThat(solution.removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
        assertThat(solution.removeOuterParentheses("()()")).isEqualTo("");
    }
}
