package pl.aswit.leetcode.easy.task163;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.findMissingRanges(new int[] {0,1,3,50,75}, 0, 99)).isEqualTo(2);
//        assertThat(solution.findMissingRanges(new int[] {-1}, -2, -1)).isEqualTo(2);
//        assertThat(solution.findMissingRanges(new int[] {-1}, -1, 0)).isEqualTo(2);
        assertThat(solution.findMissingRanges(new int[] {-1000000000,1000000000}, -1000000000, 1000000000)).isEqualTo(2);

    }

}
