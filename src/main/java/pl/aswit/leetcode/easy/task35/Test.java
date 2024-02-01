package pl.aswit.leetcode.easy.task35;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();



        assertThat(solution.searchInsert(new int[] {1,3,5,6}, 7)).isEqualTo(4);

    }

}
