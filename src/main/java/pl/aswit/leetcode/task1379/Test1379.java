package pl.aswit.leetcode.task1379;



import static org.assertj.core.api.Assertions.assertThat;

public class Test1379 {
    public static void main(String [] args){
        var solution = new Solution();


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
        assertThat(solution.getTargetCopy(tree40, tree15, tree70)).isEqualTo(3);

    }

}
