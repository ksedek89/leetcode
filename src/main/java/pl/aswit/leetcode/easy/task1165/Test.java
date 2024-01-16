package pl.aswit.leetcode.easy.task1165;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
//        assertThat(solution.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")).isEqualTo(4);
        assertThat(solution.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode")).isEqualTo(73);
    }
}
