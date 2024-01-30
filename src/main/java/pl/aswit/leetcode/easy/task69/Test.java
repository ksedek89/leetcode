package pl.aswit.leetcode.easy.task69;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.mySqrt(8)).isEqualTo(2);
        assertThat(solution.mySqrt(2147483647)).isEqualTo(46340);

    }

}
