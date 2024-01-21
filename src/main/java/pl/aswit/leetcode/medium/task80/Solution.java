package pl.aswit.leetcode.medium.task80;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        int currentElement = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int count = map.getOrDefault(currentNumber, 0);
            if(count>=2){

            }else{
                map.put(currentNumber, count+1);
                nums[currentElement++] = currentNumber;
                counter++;
            }
        }

        return counter;
    }

}


