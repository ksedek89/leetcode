package pl.aswit.leetcode.task2138;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test2138{
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.divideString("abcdefghi", 3, 'x')).isEqualTo(new String[]{"abc","def","ghi"});
        assertThat(solution.divideString("abcdefghij", 3, 'x')).isEqualTo(new String[]{"abc","def","ghi", "jxx"});
    }

}
