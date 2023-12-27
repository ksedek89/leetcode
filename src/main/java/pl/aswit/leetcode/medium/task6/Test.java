package pl.aswit.leetcode.medium.task6;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
//        assertThat(solution.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(solution.convert("A", 1)).isEqualTo("A");
//        assertThat(solution.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");

    }

}
