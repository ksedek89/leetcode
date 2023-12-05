package pl.aswit.leetcode.easy.task26;



public class Solution {

    public int removeDuplicates(int[] nums) {
        int lastEl = Integer.MIN_VALUE;
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != lastEl){
                lastEl = nums[i];
                nums[currentIndex++] = lastEl;
            }
        }
        return currentIndex;
    }
}

