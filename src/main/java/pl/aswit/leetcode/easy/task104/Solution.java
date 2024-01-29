package pl.aswit.leetcode.easy.task104;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int maxDepth;

    public int maxDepth(TreeNode root) {
        calculate(root, 0);
        return maxDepth;
    }

    private void calculate(TreeNode element, int i) {
        if(element != null){
            i++;
            maxDepth = Math.max(i, maxDepth);
            calculate(element.left, i);
            calculate(element.right, i);
        }
    }
}
