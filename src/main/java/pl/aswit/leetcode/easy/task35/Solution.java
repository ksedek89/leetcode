package pl.aswit.leetcode.easy.task35;


public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left <= right){
            int medium = left + (right-left)/2;
            if(target == nums[medium]){
                return medium;
            }else if(target > nums[medium]){
                left = medium + 1;
            }else{
                right = medium - 1;
            }
        }


        return index;

    }
}

