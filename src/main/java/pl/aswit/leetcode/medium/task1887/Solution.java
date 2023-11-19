package pl.aswit.leetcode.medium.task1887;

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    //beats 100%
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        int[] freq = new int[50001];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        int res = 0, operations = 0;
        for (int i = 50000; i >= 1; i--) {
            if (freq[i] > 0) {
                operations += freq[i];
                res += operations - freq[i];
            }
        }
        return res;
    }


    //beats 9%
    public int reductionOperationsSlower(int[] nums) {
        int noOfOperations = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap();

        for(int a: nums){
            Integer integer = treeMap.get(a);
            if(integer == null){
                treeMap.put(a, 1);
            }else{
                treeMap.put(a, integer+1);
            }
        }
        while (treeMap.size()>1){
            Map.Entry<Integer, Integer> lastEntry = treeMap.lastEntry();
            int value = lastEntry.getValue();
            noOfOperations += value;
            treeMap.remove(lastEntry.getKey());

            Map.Entry<Integer, Integer> previousEntry = treeMap.lastEntry();
            treeMap.put(previousEntry.getKey(), previousEntry.getValue() + value);
        }
        return noOfOperations;
    }

}


