package pl.aswit.leetcode.easy.task1614;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.maxDepth("(1+(2*3)+((8)/4))+1")).isEqualTo(3);
        assertThat(solution.maxDepth("(1)+((2))+(((3)))")).isEqualTo(3);
        assertThat(solution.maxDepth("+(+(+)+)+")).isEqualTo(2);
        assertThat(solution.maxDepth("()")).isEqualTo(1);
    }

}
