package pl.aswit.leetcode.medium.task624;

import java.util.List;

public class Solution {

    //beats 89%
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);

        for (int i = 1; i < arrays.size(); i++) {
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() -1);


            res = Math.max(res, Math.max(currentMax - min, max - currentMin));

            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);
        }
        return res;
    }

}


