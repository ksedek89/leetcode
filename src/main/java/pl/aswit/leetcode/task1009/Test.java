package pl.aswit.leetcode.task1009;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.bitwiseComplement(5)).isEqualTo(2);
        assertThat(solution.bitwiseComplement(7)).isEqualTo(0);
        assertThat(solution.bitwiseComplement(10)).isEqualTo(5);
    }
}
