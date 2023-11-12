package pl.aswit.leetcode.task2833;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2843 {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.furthestDistanceFromOrigin("L_RL__R")).isEqualTo(3);
        assertThat(solution.furthestDistanceFromOrigin("_R__LL_")).isEqualTo(5);
        assertThat(solution.furthestDistanceFromOrigin("_______")).isEqualTo(7);
    }

}
