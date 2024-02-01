package pl.aswit.leetcode.medium.task322;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
//        assertThat(solution.rob(new int[]{2,7,9,3,1})).isEqualTo(12);
        assertThat(solution.rob(new int[]{2,1,1,2})).isEqualTo(4);


    }

}
