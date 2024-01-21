package pl.aswit.leetcode.easy.task169;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.majorityElement(new int[] {2,2,1,1,1,2,2})).isEqualTo(2);

    }

}
