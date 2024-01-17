package pl.aswit.leetcode.medium.task15;

import java.util.*;

public class Solution {


    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = nums.length-1;
            while (left < right)
            {
                if(left == i){
                    left++;
                }else if(right == i){
                    right--;
                }else if(nums[left] + nums[right] + nums[i] > 0){
                    right--;
                }else if(nums[left] + nums[right] + nums[i] < 0){
                    left++;
                }else{
                    if(i <= left){
                        set.add(List.of(nums[i],nums[left],nums[right]));
                    }else if(i > right){
                        set.add(List.of(nums[left],nums[right],nums[i]));
                    }else{
                        set.add(List.of(nums[left],nums[i],nums[right]));
                    }
                   left++;right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}


