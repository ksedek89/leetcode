package pl.aswit.leetcode.medium.task1561;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.maxCoins(new int[]{2,4,1,2,7,8})).isEqualTo(9);
        assertThat(solution.maxCoins(new int[]{2,4,5})).isEqualTo(4);
        assertThat(solution.maxCoins(new int[]{9,8,7,6,5,1,2,3,4})).isEqualTo(18);

    }

}
