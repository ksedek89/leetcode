package pl.aswit.leetcode.easy.task290;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.wordPattern("abba", "dog cat cat dog")).isEqualTo(true);
//        assertThat(solution.wordPattern("abba", "dog cat cat fish")).isEqualTo(false);
//        assertThat(solution.wordPattern("aaaa", "dog cat cat dog")).isEqualTo(false);
        assertThat(solution.wordPattern("abba", "dog dog dog dog")).isEqualTo(false);

    }

}
