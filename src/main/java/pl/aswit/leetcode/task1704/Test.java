package pl.aswit.leetcode.task1704;


import static org.assertj.core.api.Assertions.assertThat;
//beats 95%
public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.halvesAreAlike("book")).isEqualTo(true);
        assertThat(solution.halvesAreAlike("textbook")).isEqualTo(false);
    }

}
