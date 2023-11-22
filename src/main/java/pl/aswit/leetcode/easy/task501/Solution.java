package pl.aswit.leetcode.easy.task501;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {

    //beats 38%
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        countElement(map, root);

        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entries : map.entrySet()){
            Integer value = entries.getValue();
            if(value > maxCount){
                maxCount = value;
            }
        };

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entries : map.entrySet()){
            Integer value = entries.getValue();
            if(value == maxCount){
                list.add(entries.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private void countElement(HashMap<Integer, Integer> map, TreeNode root){
        if(root != null){
            Integer orDefault = map.getOrDefault(root.val, 0);
            map.put(root.val, orDefault+1);
            countElement(map, root.left);
            countElement(map, root.right);
        }
    }
}