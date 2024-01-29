package pl.aswit.leetcode.easy.task163;

import java.util.*;

public class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }


    public List<List<Integer>> findMissingRangesTLE(int[] nums, int lower, int upper) {
        int noOfIterrations = 0;
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length == 0){
            result.add(List.of(lower, upper));
            return result;
        }


        List<Integer> currentElement = new ArrayList<>();
        int currentNumIndex = 0;
        for (int i = lower; i <= upper; i++) {
            noOfIterrations++;

            while (nums[currentNumIndex] < i && currentNumIndex < nums.length-1){
                noOfIterrations++;
                currentNumIndex++;
            }

            if(nums[currentNumIndex] == i){
                if(currentElement.size() == 1){
                    currentElement.add(i-1);
                    result.add(currentElement);
                    currentElement = new ArrayList<>();
                }
            }else{
                if(currentElement.size() == 0){
                    currentElement.add(i);
                }
            }
        }

        if(currentElement.size() == 1){
            currentElement.add(upper);
            result.add(currentElement);
        }
        System.out.println(noOfIterrations);
        return result;
    }

}
