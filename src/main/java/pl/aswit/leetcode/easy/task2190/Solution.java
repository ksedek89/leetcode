package pl.aswit.leetcode.easy.task2190;

public class Solution {

    public int mostFrequent(int[] nums, int key) {
        int[] tab = new int[1000];
        int max = 0;
        int maxIndex = -1;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == key){
                int curVal = ++tab[nums[i+1]-1];
                if(curVal > max){
                    max = curVal;
                    maxIndex = nums[i+1];
                }
            }
        }
        return maxIndex;
    }
}
