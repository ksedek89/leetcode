package pl.aswit.leetcode.easy.task94;


public class Solution {

    public int removeElement(int[] nums, int val) {
        int currIndex = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if(currentNum != val){
                counter++;
                nums[currIndex++] = currentNum;
            }

        }
        return counter;

    }
}

