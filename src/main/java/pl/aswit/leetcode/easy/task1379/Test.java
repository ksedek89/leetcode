package pl.aswit.leetcode.easy.task1379;



import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        TreeNode tree19 = new TreeNode(19);
        TreeNode tree19c = new TreeNode(19);
        TreeNode tree6 = new TreeNode(6);
        TreeNode tree6c = new TreeNode(6);
        TreeNode tree3 = new TreeNode(3, tree6, tree19);
        TreeNode tree3c = new TreeNode(3, tree6c, tree19c);
        TreeNode tree4 = new TreeNode(4);
        TreeNode tree4c = new TreeNode(4);

        TreeNode tree7 = new TreeNode(7, tree4, tree3);
        TreeNode tree7c = new TreeNode(7, tree4c, tree3c);
        assertThat(solution.getTargetCopy(tree7, tree7c, tree3)).isEqualTo(tree3c);

    }

}
