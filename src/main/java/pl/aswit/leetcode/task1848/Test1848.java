package pl.aswit.leetcode.task1848;


import static org.assertj.core.api.Assertions.assertThat;

public class Test1848 {

    public static void main(String[] args) {
        var solution = new Solution();
//        assertThat(solution.getMinDistance(new int[] {1,2,3,4,5}, 5, 3)).isEqualTo(1);
//        assertThat(solution.getMinDistance(new int[] {1}, 1, 0)).isEqualTo(0);
//        assertThat(solution.getMinDistance(new int[] {1,1,1,1,1,1,1,1,1,1}, 1, 0)).isEqualTo(0);
//        assertThat(solution.getMinDistance(new int[] {5,3,6}, 5, 2)).isEqualTo(2);
        assertThat(solution.getMinDistance(new int[] {1,1,1,1,1,1,1,1,1,1}, 1, 9)).isEqualTo(0);
    }
}
