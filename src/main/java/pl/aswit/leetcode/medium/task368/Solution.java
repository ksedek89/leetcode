package pl.aswit.leetcode.medium.task368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int length = nums.length;
        List<Integer>[] dp = new ArrayList[length];
        Arrays.sort(nums);

        for (int i = 0; i <dp.length ; i++) {
            dp[i] = new ArrayList<>();
        }

        dp[length-1].add(nums[length-1]);


        List<Integer> resultList = dp[length-1];
        for (int i = length-2; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i+1; j < length ; j++) {
                if(nums[j] % nums[i] == 0 &&  dp[j].size() > dp[maxIndex].size() ){
                    maxIndex = j;
                }
            }

            dp[i].add(nums[i]);
            if(maxIndex!= i){
                dp[i].addAll(dp[maxIndex]);
            }

            if(dp[i].size() >= resultList.size()){
                resultList = dp[i];
            }
            System.out.println();
        }


        return resultList;
    }
}


