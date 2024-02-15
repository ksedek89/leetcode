package pl.aswit.leetcode.medium.task368;



import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

//        assertThat(solution.largestDivisibleSubset(new int[]{1,2,3})).isEqualTo(new int[]{1,2});
        assertThat(solution.largestDivisibleSubset(new int[]{3,4,16,8})).isEqualTo(new int[]{1,2});
//        assertThat(solution.largestDivisibleSubset(new int[]{1,2,3,4,6,8})).isEqualTo(new int[]{1,2});



    }

}
