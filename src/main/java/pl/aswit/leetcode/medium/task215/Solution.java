package pl.aswit.leetcode.medium.task215;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        int[] temp = new int[4001];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] + 2000] = temp[nums[i] + 2000] + 1;
        }

        int counter = 0;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (temp[i] != 0) {
                counter++;
            }
            if (counter == k) {
                return i - 2000;
            }
        }

        return -1;
    }
}


