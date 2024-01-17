package pl.aswit.leetcode.medium.task17;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        assertThat(solution.letterCombinations("23")).isEqualTo(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});


    }

}

