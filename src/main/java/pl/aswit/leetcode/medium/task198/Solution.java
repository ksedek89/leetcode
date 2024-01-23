package pl.aswit.leetcode.medium.task198;

public class Solution {

    public int rob(int[] nums) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==1){
                sumOdd += nums[i];
            }else{
                sumEven += nums[i];
            }
        }
        return Math.max(sumEven, sumOdd);
    }
}


