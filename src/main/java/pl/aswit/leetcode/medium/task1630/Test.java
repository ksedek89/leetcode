package pl.aswit.leetcode.medium.task1630;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.checkArithmeticSubarrays(new int[]{4,6,5,9,3,7}, new int[] {0,0,2}, new int[]{2,3,5})).isEqualTo(new boolean[]{true,false,true});

    }

}
