package pl.aswit.leetcode.easy.task14;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.longestCommonPrefix(new String [] {"flower","flow","flight"})).isEqualTo("fl");

    }

}
