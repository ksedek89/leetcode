package pl.aswit.leetcode.easy.task20;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
//        assertThat(solution.isValid("()[]{}")).isEqualTo(true);
        assertThat(solution.isValid("(]")).isEqualTo(false);

    }

}
