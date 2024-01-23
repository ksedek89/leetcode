package pl.aswit.leetcode.medium.task1167;


import java.util.*;

public class Solution {

    public int connectSticks(int[] sticks) {
        int total = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int stick : sticks) {
            priorityQueue.add(stick);
        }

        while (priorityQueue.size() > 1){
            int i1 = priorityQueue.remove();
            int i2 = priorityQueue.remove();
            total = i1 + i2 + total;
            priorityQueue.add(i1+i2);
        }


        return total;
    }
}


