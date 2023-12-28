package pl.aswit.leetcode.hard.task10;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.isMatch("aa", "p")).isEqualTo(false);
//        assertThat(solution.isMatch("aa", "a*")).isEqualTo(true);
//        assertThat(solution.isMatch("ab", ".*")).isEqualTo(true);
//        assertThat(solution.isMatch("mississippi", "mis*is*ip*.")).isEqualTo(true);
//        assertThat(solution.isMatch("ab", ".*c")).isEqualTo(false);
//        assertThat(solution.isMatch("aaa", "aaaa")).isEqualTo(false);
        assertThat(solution.isMatch("aaa", "a*a")).isEqualTo(true);

    }


}


