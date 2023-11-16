package pl.aswit.leetcode.easy.task1848;

public class Solution {

    //beats 100%
    public int getMinDistance(int[] nums, int target, int start) {
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                int abs = Math.abs(i - start);
                if(abs < minimum){
                    minimum = abs;
                }
            }
        }
        return minimum;
    }

}
