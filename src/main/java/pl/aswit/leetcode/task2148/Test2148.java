package pl.aswit.leetcode.task2148;


import static org.assertj.core.api.Assertions.assertThat;

public class Test2148 {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.countElements(new int[] {11,7,2,15})).isEqualTo(2);
        assertThat(solution.countElements(new int[] {-3,3,3,90})).isEqualTo(2);
    }

}
