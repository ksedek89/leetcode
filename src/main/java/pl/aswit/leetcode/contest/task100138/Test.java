package pl.aswit.leetcode.contest.task100138;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.maximizeSquareHoleArea(2, 1 ,new int[] {2,3}, new int[] {2})).isEqualTo(4);
//        assertThat(solution.maximizeSquareHoleArea(1, 1 ,new int[] {2}, new int[] {2})).isEqualTo(4);
//        assertThat(solution.maximizeSquareHoleArea(2, 3 ,new int[] {2,3}, new int[] {2,3,4})).isEqualTo(9);
        assertThat(solution.maximizeSquareHoleArea(3, 2 ,new int[] {3,2,4}, new int[] {3,2})).isEqualTo(9);
        }


}
