package pl.aswit.leetcode.easy.task252;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.wordPattern("abba", "dog cat cat dog")).isEqualTo(true);
//        assertThat(solution.wordPattern("abba", "dog cat cat fish")).isEqualTo(false);
//        assertThat(solution.wordPattern("aaaa", "dog cat cat dog")).isEqualTo(false);
        assertThat(solution.canAttendMeetings(new int[][]{{0,30},{5,10},{15,20}})).isEqualTo(false);
//        assertThat(solution.canAttendMeetings(new int[][]{{7,10},{2,4}})).isEqualTo(true);

    }

}
