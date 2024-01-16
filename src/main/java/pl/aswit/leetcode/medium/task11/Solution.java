package pl.aswit.leetcode.medium.task11;

public class Solution {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int area = 0;
        while (r > l){
            area = Math.max((r-l) * Math.min(height[r], height[l]), area);
            if(height[r] > height[l]){
                l++;
            }else{
                r--;
            }
        }

        return area;
    }
}


