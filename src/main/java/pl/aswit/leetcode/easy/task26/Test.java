package pl.aswit.leetcode.easy.task26;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.removeDuplicates(new int[]{1,1,2})).isEqualTo(2);
        assertThat(solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4})).isEqualTo(5);

    }

}
