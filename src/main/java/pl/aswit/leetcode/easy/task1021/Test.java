package pl.aswit.leetcode.easy.task1021;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.removeOuterParentheses("(()())(())")).isEqualTo("()()()");
        assertThat(solution.removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
        assertThat(solution.removeOuterParentheses("()()")).isEqualTo("");
    }
}
