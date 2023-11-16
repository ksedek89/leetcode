package pl.aswit.leetcode.easy.task2446;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00","03:00"})).isEqualTo(true);
        assertThat(solution.haveConflict(new String[]{"01:00","02:00"}, new String[]{"01:20","03:00"})).isEqualTo(true);
        assertThat(solution.haveConflict(new String[]{"10:00","11:00"}, new String[]{"14:00","15:00"})).isEqualTo(false);
    }

}
