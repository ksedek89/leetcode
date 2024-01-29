package pl.aswit.leetcode.easy.task108;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        assertThat(solution.sortedArrayToBST(new int[]{-10,-3,0,5,9})).isEqualTo(0);
    }
}
