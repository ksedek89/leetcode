package pl.aswit.leetcode.medium.task15;


import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                if (left == i) {
                    left++;
                    continue;
                } else if (right == i) {
                    right--;
                    continue;
                }
                int currentTotal = nums[left] + nums[right] + nums[i];
                if(Math.abs(currentTotal - target) <= Math.abs(result-target)){
                    result = currentTotal;
                }
                if (result == target) {
                    return target;
                } else if (currentTotal > target) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return result;
    }
}


