
package pl.aswit.leetcode.easy.task101;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.*;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        addToMap(map, root, 1);
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            if(!isBranchSymetric(entry.getValue())){
                return false;
            }
        }
        return true;
    }

    private boolean isBranchSymetric(List<Integer> value) {
        for (int i = 0; i < value.size(); i++) {
            if(value.get(i) != value.get(value.size()-1-i)){
                return false;
            }
        }
        return true;
    }

    private void addToMap(Map<Integer, List<Integer>> map, TreeNode node, int i) {
        List<Integer> integers = map.get(i);
        if(integers == null){
            integers = new ArrayList<>();
        }
        if(node == null){
            integers.add(101);
            map.put(i, integers);
        }else{
            integers.add(node.val);
            map.put(i, integers);
            addToMap(map, node.left, i+1);
            addToMap(map, node.right, i+1);
        }

    }

}
