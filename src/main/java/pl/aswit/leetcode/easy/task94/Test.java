package pl.aswit.leetcode.easy.task94;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.removeElement(new int[] {3,2,2,3}, 3)).isEqualTo(2);
        assertThat(solution.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2)).isEqualTo(5);

    }

}
