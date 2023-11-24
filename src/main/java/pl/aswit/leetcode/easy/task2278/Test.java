package pl.aswit.leetcode.easy.task2278;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.percentageLetter("foobar", 'o')).isEqualTo(33);
    }

}
