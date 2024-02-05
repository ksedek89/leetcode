package pl.aswit.leetcode.medium.task1027;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestArithSeqLength(int[] nums) {
        int maxLength = 0;
        Map<Integer, Integer>[] map = new HashMap[nums.length];
        for (int right = 0; right < nums.length; right++) {
            map[right] = new HashMap<>();
            for (int left = 0; left < right; left++) {
                int diff = nums[right] - nums[left];
                int value = map[left].getOrDefault(diff, 1);
                map[right].put(diff, value+1);
                maxLength = Math.max(value+1, maxLength);
            }
        }

        return maxLength;
    }}

