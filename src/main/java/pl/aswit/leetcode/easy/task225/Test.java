package pl.aswit.leetcode.easy.task225;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

//        assertThat(solution.isPowerOfTwo(1)).isEqualTo(true);
//        assertThat(solution.isPowerOfTwo(16)).isEqualTo(true);
//        assertThat(solution.isPowerOfTwo(32)).isEqualTo(false);
        assertThat(solution.isPowerOfTwo(1073741824)).isEqualTo(true);

    }

}
