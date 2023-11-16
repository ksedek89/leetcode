package pl.aswit.leetcode.easy.task2085;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.countWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"})).isEqualTo(2);
    }

}
