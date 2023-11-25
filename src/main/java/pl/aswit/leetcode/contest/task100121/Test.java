package pl.aswit.leetcode.contest.task100121;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.findWordsContaining(new String[]{"leet","code"}, 'e')).isEqualTo(new int[] {0, 1});
        }


}
