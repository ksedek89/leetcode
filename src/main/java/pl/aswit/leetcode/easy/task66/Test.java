package pl.aswit.leetcode.easy.task66;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.plusOne(new int[] {8,9,9,9})).isEqualTo(new int[]{9,0,0,0});
//        assertThat(solution.plusOne(new int[] {9})).isEqualTo(new int[]{1,0});
        assertThat(solution.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})).isEqualTo(new int[]{9,8,7,6,5,4,3,2,1,1});

    }

}
