package pl.aswit.leetcode.easy.task1207;


import java.util.*;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> nomOfElements = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer orDefault = nomOfElements.getOrDefault(arr[i], 0);
            nomOfElements.put(arr[i], ++orDefault);
        }
        Map<Integer, Integer> result = new HashMap<>();
        for(Map.Entry<Integer, Integer> entries : nomOfElements.entrySet()){
            if(result.containsKey(entries.getValue())){
                return false;
            }else{
                result.put(entries.getValue(), 1);
            }
        };
        return true;
    }
}
