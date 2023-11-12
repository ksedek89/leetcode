package pl.aswit.leetcode.task2000;


import static org.assertj.core.api.Assertions.assertThat;

public class Test2000{
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.reversePrefix("abcdefd", 'd')).isEqualTo("dcbaefd");
    }

}
