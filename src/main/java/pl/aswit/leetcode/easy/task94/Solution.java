package pl.aswit.leetcode.easy.task94;

import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://www.programiz.com/dsa/binary-tree
//https://www.javatpoint.com/inorder-traversal

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curElement = root;
        while (curElement != null || stack.size() != 0){
            while (curElement != null){
                stack.push(curElement);
                curElement = curElement.left;
            }
            TreeNode pop = stack.pop();
            curElement = pop.right;
            list.add(pop.val);
        }
        return list;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addToList(list, root);
        return list;
    }

    private void addToList(List<Integer> list, TreeNode node){
        if(node == null){
            return;
        }
        addToList(list, node.left);
        list.add(node.val);
        addToList(list, node.right);
    }
}

