package pl.aswit.leetcode.easy.task190;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.reverseBits(43261596)).isEqualTo(964176192);
//        assertThat(solution.reverseBits(-3)).isEqualTo(3221225471l);

    }

}
