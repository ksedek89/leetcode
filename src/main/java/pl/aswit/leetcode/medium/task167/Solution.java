package pl.aswit.leetcode.medium.task167;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int lower = 0;
        int higher = numbers.length-1;

        while (lower < higher){
            if(numbers[lower] + numbers[higher] > target){
                higher--;
            }else if(numbers[lower] + numbers[higher] < target){
                lower++;
            }else{
                return new int[] {lower+1, higher+1};
            }
        }
        return null;
    }

}


