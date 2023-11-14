package pl.aswit.leetcode.task205;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.isIsomorphic("egg", "add")).isEqualTo(true);
//        assertThat(solution.isIsomorphic("foo", "bar")).isEqualTo(false);
//        assertThat(solution.isIsomorphic("paper", "title")).isEqualTo(true);
//        assertThat(solution.isIsomorphic("badc", "baba")).isEqualTo(false);

    }

}
