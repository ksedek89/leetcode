package pl.aswit.leetcode.medium.task1808;

public class Solution {


    //beats 65%
        public int[] getSumAbsoluteDifferences(int[] nums) {
            int[] result = new int[nums.length];
            int sum[] = new int[nums.length];


            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i-1] + nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                int sumBefore = i > 0 ? (i * nums[i] - sum[i-1]) : 0;
                int sumAfter = sum[nums.length-1] - sum[i] - (nums.length-i-1) * nums[i];
                result[i] = sumBefore + sumAfter;
            }

            return result;
        }

}


