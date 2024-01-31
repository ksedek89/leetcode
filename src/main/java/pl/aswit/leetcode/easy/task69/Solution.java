package pl.aswit.leetcode.easy.task69;


public class Solution {


    public int mySqrt(int x) {
        int low = 0;
        int high = 46340;
        int number = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= x) {
                low = mid;
                number = mid;
            } else {
                high = mid;
            }
        }
        return number;
    }

}

