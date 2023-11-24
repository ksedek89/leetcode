package pl.aswit.leetcode.easy.task2363;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.mergeSimilarItems(new int[][]{{15,5},{2,6},{5,3},{14,8},{12,4},{19,6},{25,4},{13,4},{9,1}}, new int[][]{{3,1}, {1,5}})).isEqualTo(null);
    }

}
