package pl.aswit.leetcode.medium.task215;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)).isEqualTo(4);


    }

}
