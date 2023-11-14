package pl.aswit.leetcode.task1323;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

        assertThat(solution.maximum69Number(9669)).isEqualTo(9969);
        assertThat(solution.maximum69Number(9996)).isEqualTo(9999);
        assertThat(solution.maximum69Number(9999)).isEqualTo(9999);

    }

}
