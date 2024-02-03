package pl.aswit.leetcode.medium.task98;

import pl.aswit.leetcode.utils.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean checkTree(TreeNode node, long low, long  high){
        if(node == null){
            return true;
        }
        if(node != null &&  node.val >= high){
            return false;
        }
        if(node != null &&  node.val <= low){
            return false;
        }

        boolean leftResult = checkTree(node.left, low, node.val);
        boolean rightResult = checkTree(node.right, node.val, high);
        return leftResult && rightResult;
    }
}