package pl.aswit.leetcode.task1260;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
//        assertThat(solution.shiftGrid(new int[][]{{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23)).isEqualTo(new int[][]{{9, 1, 2}, {3, 4, 5}, {6, 7, 8}});
        assertThat(solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1)).isEqualTo(new int[][]{{9, 1, 2}, {3, 4, 5}, {6, 7, 8}});
//        assertThat(solution.shiftGrid(new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4)).isEqualTo(new int[][]{{12, 0, 21, 13}, {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}});
    }
}
