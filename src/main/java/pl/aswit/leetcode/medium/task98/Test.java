package pl.aswit.leetcode.medium.task98;


import pl.aswit.leetcode.utils.TreeNode;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
        var solution = new Solution();

/*        TreeNode tree1 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(3);
        TreeNode tree2 = new TreeNode(2, tree1, tree3);*/

        TreeNode tree1 = new TreeNode(1);
        TreeNode tree11 = new TreeNode(1, null, tree1);

/*        TreeNode tree1 = new TreeNode(2147483647);
        TreeNode tree11 = new TreeNode(1, null, tree1);*/

        assertThat(solution.isValidBST(tree11)).isEqualTo((false));


    }

}
