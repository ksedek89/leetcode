package pl.aswit.leetcode.easy.task101;



import pl.aswit.leetcode.utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String[] args) {
        var solution = new Solution();
        TreeNode tree3 = new TreeNode(3);
        TreeNode tree4 = new TreeNode(4);
        TreeNode tree4a = new TreeNode(4);
        TreeNode tree3a = new TreeNode(3);

        TreeNode tree2 = new TreeNode(2, tree3, tree4);
        TreeNode tree2a = new TreeNode(2, tree4a, tree3a);
        TreeNode tree1 = new TreeNode(1, tree2, tree2a);


        assertThat(solution.isSymmetric(tree1)).isEqualTo(true);
    }
}
