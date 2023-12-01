package pl.aswit.leetcode.easy.task1662;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"})).isEqualTo(false);
        assertThat(solution.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})).isEqualTo(true);

    }

}
