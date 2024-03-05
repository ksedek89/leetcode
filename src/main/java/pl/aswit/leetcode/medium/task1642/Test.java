package pl.aswit.leetcode.medium.task1642;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.largestSubmatrix(new int[][]{{0,0,1},{1,1,1},{1,0,1}})).isEqualTo(4);
//        assertThat(solution.furthestBuilding(new int[]{4,2,7,6,9,14,12}, 5,1)).isEqualTo(4);
//        assertThat(solution.furthestBuilding(new int[]{14,3,19,3}, 7,0)).isEqualTo(4);
        assertThat(solution.furthestBuilding(new int[]{1, 2}, 0,0)).isEqualTo(0);

    }

}
