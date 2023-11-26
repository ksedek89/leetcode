package pl.aswit.leetcode.easy.task1;

import pl.aswit.leetcode.utils.TreeNode;

import java.util.*;



public class Solution {
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int currentInt = nums[i];
        if (map.containsKey(target - currentInt) && map.get(target - currentInt) != i) {
            return new int[]{i, map.get(target - currentInt)};
        }
    }
    return null;
}
}

