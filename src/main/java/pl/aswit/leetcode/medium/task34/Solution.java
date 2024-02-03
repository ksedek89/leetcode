package pl.aswit.leetcode.medium.task34;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};


        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target ){
                result[0] = mid;
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }


        }


        left = 0;
        right = nums.length-1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target ){
                result[1] = mid;
                left = mid + 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }
        return result;
    }


}


