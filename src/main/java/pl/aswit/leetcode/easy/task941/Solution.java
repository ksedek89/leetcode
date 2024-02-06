package pl.aswit.leetcode.easy.task941;


public class Solution {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean isRising = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (isRising) {
                if (arr[i] < arr[i - 1]) {
                    isRising = false;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
        }
        return true & !isRising & arr[1] > arr[0];
    }
}
