package pl.aswit.leetcode.easy.tak733;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();



        assertThat(solution.floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 1, 1, 2)).isEqualTo(new int[][]{{2,2,2},{2,2,0},{2,0,1}});
        assertThat(solution.floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0)).isEqualTo(new int[][]{{0,0,0},{0,0,0}});

    }

}
