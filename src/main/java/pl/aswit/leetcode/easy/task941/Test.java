package pl.aswit.leetcode.easy.task941;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9})).isEqualTo(false);
        assertThat(solution.validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0})).isEqualTo(false);

    }
}
