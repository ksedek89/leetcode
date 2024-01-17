package pl.aswit.leetcode.medium.task15;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
//        assertThat(solution.threeSumClosest(new int[] {-1,2,1,-4}, 1)).isEqualTo(2);
//        assertThat(solution.threeSumClosest(new int[] {4,0,5,-5,3,3,0,-4,-5}, -2)).isEqualTo(-2);
        assertThat(solution.threeSumClosest(new int[] {0,3,97,102,200}, 300)).isEqualTo(300);


    }

}

