package pl.aswit.leetcode.easy.task121;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.maxProfit(new int[] {7,1,5,3,6,4})).isEqualTo(5);

    }

}
