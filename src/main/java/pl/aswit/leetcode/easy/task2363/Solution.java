package pl.aswit.leetcode.easy.task2363;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

public class Solution {


    //beats 82%
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        int maxKey = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            maxKey = Math.max(maxKey, items1[i][0]);
            Integer orDefault = map.getOrDefault(items1[i][0], 0);
            map.put(items1[i][0], orDefault + items1[i][1]);
        }

        for (int i = 0; i < items2.length; i++) {
            maxKey = Math.max(maxKey, items2[i][0]);
            Integer orDefault = map.getOrDefault(items2[i][0], 0);
            map.put(items2[i][0], orDefault + items2[i][1]);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        System.out.println();

        for (int i = 0; i <= maxKey; i++) {
            Integer entry = map.get(i);
            if (entry != null) {
                result.add(List.of(i, entry));
            }
        }
        return result;
    }

}
