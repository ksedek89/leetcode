package pl.aswit.leetcode.easy.task908;


import java.util.Arrays;

public class Solution {

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[nums.length-1] - nums[0] <= 2*k){
            return 0;
        }else{
            return nums[nums.length-1] - nums[0] - 2*k;
        }
    }

}
