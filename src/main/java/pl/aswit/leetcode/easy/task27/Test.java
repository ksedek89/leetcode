package pl.aswit.leetcode.easy.task27;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();

/*        TreeNode tree3 = new TreeNode(3);
        TreeNode tree2 = new TreeNode(2, tree3, null);
        TreeNode tree1 = new TreeNode(1, null, tree2);*/

        TreeNode tree15 = new TreeNode(15);
        TreeNode tree28 = new TreeNode(28);
        TreeNode tree55 = new TreeNode(55);
        TreeNode tree70 = new TreeNode(70);
        TreeNode tree25 = new TreeNode(25, tree15, tree28);
        TreeNode tree35 = new TreeNode(35);
        TreeNode tree45 = new TreeNode(45);
        TreeNode tree60 = new TreeNode(60, tree55, tree70);
        TreeNode tree30 = new TreeNode(30, tree25, tree35);
        TreeNode tree50 = new TreeNode(50, tree45, tree60);
        TreeNode tree40 = new TreeNode(40, tree30, tree50);

        assertThat(solution.inorderTraversal(tree40)).isEqualTo(List.of(15, 25, 28, 30, 35, 40, 45, 50, 55, 60, 70));

    }

}
