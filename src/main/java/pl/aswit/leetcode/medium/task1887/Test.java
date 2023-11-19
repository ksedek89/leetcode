package pl.aswit.leetcode.medium.task1887;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.reductionOperations(new int[]{5,1,3})).isEqualTo(3);
        assertThat(solution.reductionOperations(new int[]{1,1,2,2,3})).isEqualTo(4);


    }

}
