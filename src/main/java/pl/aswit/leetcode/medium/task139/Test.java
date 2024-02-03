package pl.aswit.leetcode.medium.task139;


import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

//        assertThat(solution.wordBreak("applepenapple", List.of(new String[]{"apple", "pen"}))).isEqualTo(true);
        assertThat(solution.wordBreak("ab", List.of(new String[]{"a", "b"}))).isEqualTo(true);

    }

}
