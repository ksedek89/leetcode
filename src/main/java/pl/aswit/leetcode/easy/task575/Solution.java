package pl.aswit.leetcode.easy.task575;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> candyMap = new HashMap<>();
        int nomOfCandy = 0;
        for (int i = 0; i < candyType.length; i++) {
            int currentCandy = candyType[i];
            Integer orDefault = candyMap.getOrDefault(currentCandy, 0);
            if(orDefault == 0){
                nomOfCandy++;
                candyMap.put(currentCandy, 1);
            }

        }
        return nomOfCandy > candyType.length / 2 ? candyType.length / 2 : nomOfCandy;
    }
}