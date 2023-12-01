package pl.aswit.leetcode.easy.task1099;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int twoSumLessThanK(int[] nums, int k) {
        int result = -1;
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length-1;
        for (int j = 0; j < nums.length ; j++) {
            if(first == last){
                break;
            }
            int firstVal = nums[first];
            int lastVal = nums[last];
            if(firstVal +lastVal < k){
                result = Math.max(firstVal + lastVal, result);
                first++;
            }else{
                last--;
            }


        }

        return result;
    }

}
