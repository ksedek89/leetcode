package pl.aswit.leetcode.medium.task189;

public class Solution {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int[] numsTemp = new int [nums.length + nums.length - k];

        for (int i = 0; i < nums.length; i++) {
            numsTemp[i] = nums[i];
        }

        int counter = 0;
        for (int i = nums.length; i < numsTemp.length; i++) {
            numsTemp[i] = nums[counter++];

        }
        counter = 0;
        for (int i = nums.length-k; i < numsTemp.length; i++) {
             nums[counter++] = numsTemp[i];

        }
        System.out.println();
    }

}


