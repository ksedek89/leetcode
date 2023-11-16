package pl.aswit.leetcode.easy.task2138;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.divideString("abcdefghi", 3, 'x')).isEqualTo(new String[]{"abc","def","ghi"});
        assertThat(solution.divideString("abcdefghij", 3, 'x')).isEqualTo(new String[]{"abc","def","ghi", "jxx"});
    }

}
