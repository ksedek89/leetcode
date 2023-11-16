package pl.aswit.leetcode.easy.task2833;

public class Solution {

    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int length = moves.length();

        for(char c : moves.toCharArray()){
            if(c == 'L'){
                lCount++;
            }else if(c == 'R'){
                rCount++;
            }
        }
        return Math.max(lCount, rCount) + (length - lCount - rCount) - Math.min(lCount, rCount);

    }
}