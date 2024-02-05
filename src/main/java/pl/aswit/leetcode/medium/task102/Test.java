package pl.aswit.leetcode.medium.task102;


import pl.aswit.leetcode.utils.TreeNode;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();
        TreeNode tree15 = new TreeNode(15);
        TreeNode tree7 = new TreeNode(7);
        TreeNode tree20 = new TreeNode(20, tree15, tree7);
        TreeNode tree9 = new TreeNode(9);

        TreeNode tree3 = new TreeNode(3, tree9, tree20);

        assertThat(solution.levelOrder(tree3)).isEqualTo(true);

    }

}
