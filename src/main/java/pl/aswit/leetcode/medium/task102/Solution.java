package pl.aswit.leetcode.medium.task102;

import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    Map<Integer, List<Integer>> map = new HashMap<>();
    int maxLevel = 0;

    public List<List<Integer>> levelOrder(TreeNode root) {
        calculate(root, 0);

        List<List<Integer>> list = new ArrayList<>();
        System.out.println(map);
        System.out.println(maxLevel);

        for (int counter = 0; counter <= maxLevel; counter++) {
            int temp = counter;
            list.add(map.get(temp));

        }

        return list;
    }

    private void calculate(TreeNode node, int level){
        if(node == null){
            return;
        }
        maxLevel = Math.max(maxLevel, level);

        calculate(node.left, level+1);
        List<Integer> list = map.getOrDefault(level, new ArrayList<Integer>());
        list.add(node.val);
        map.put(level, list);

        calculate(node.right, level+1);

    }
}


