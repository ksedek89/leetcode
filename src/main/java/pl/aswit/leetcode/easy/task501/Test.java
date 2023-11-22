package pl.aswit.leetcode.easy.task501;


import pl.aswit.leetcode.utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){

        Solution solution = new Solution();

        TreeNode tree2 = new TreeNode(2);
        TreeNode tree22 = new TreeNode(2, tree2, null);
        TreeNode tree1 = new TreeNode(1, null, tree22);

        assertThat(solution.findMode(tree1)).isEqualTo(new int[]{2});

    }

}
