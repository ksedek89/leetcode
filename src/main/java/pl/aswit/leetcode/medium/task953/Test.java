package pl.aswit.leetcode.medium.task953;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

//        assertThat(solution.isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")).isEqualTo(true);
//        assertThat(solution.isAlienSorted(new String[] {"apple","app"}, "abcdefghijklmnopqrstuvwxyz")).isEqualTo(false);
//        assertThat(solution.isAlienSorted(new String[] {"hello", "hello"}, "abcdefghijklmnopqrstuvwxyz")).isEqualTo(true);
        assertThat(solution.isAlienSorted(new String[] {"app","apple"}, "abcdefghijklmnopqrstuvwxyz")).isEqualTo(true);

    }

}
