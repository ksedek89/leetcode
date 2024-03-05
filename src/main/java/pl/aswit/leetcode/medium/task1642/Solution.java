package pl.aswit.leetcode.medium.task1642;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
            int difference = heights[i] - heights[i-1];
            if(difference <= 0){
                continue;
            }

            p.add(difference);

            if(p.size() <= ladders){
                continue;
            }


            int minVal = p.remove();
            bricks -= minVal;
            if(bricks < 0){
                return i-1;
            }

        }

        return heights.length-1;
    }
}


