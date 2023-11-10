package pl.aswit.leetcode.task2190;


import static org.assertj.core.api.Assertions.assertThat;

public class Test2190 {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.mostFrequent(new int[]{1, 100, 200, 1, 100}, 1)).isEqualTo(100);
        assertThat(solution.mostFrequent(new int[]{2,2,2,2,3}, 2)).isEqualTo(2);
    }

}
