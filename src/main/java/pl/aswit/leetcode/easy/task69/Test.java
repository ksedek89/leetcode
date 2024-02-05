package pl.aswit.leetcode.easy.task69;


import java.util.ArrayDeque;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        ArrayDeque a = new ArrayDeque();
        a.addLast("-2");
        a.push("0");
        a.push("-3");
        a.pop();
        System.out.println(a.peekFirst());


//        assertThat(solution.mySqrt(8)).isEqualTo(2);
        assertThat(solution.mySqrt(2147483647)).isEqualTo(46340);

    }

}
