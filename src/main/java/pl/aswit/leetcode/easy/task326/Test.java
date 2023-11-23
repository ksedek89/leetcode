package pl.aswit.leetcode.easy.task326;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){

        Solution solution = new Solution();


        assertThat(solution.isPowerOfThree(27)).isEqualTo(true);
        assertThat(solution.isPowerOfThree(0)).isEqualTo(false);
        assertThat(solution.isPowerOfThree(-1)).isEqualTo(false);

    }

}
