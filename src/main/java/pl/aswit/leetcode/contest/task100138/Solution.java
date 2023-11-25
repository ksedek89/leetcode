package pl.aswit.leetcode.contest.task100138;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    //task2943
    //    https://leetcode.com/contest/biweekly-contest-118/problems/maximize-area-of-square-hole-in-grid/
        public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
            int longestH = 0;
            int current = 0;
            int lastValue = 0;

            Arrays.sort(hBars);
            Arrays.sort(vBars);

            for (int i = 0; i < hBars.length ; i++) {
                int currHBar = hBars[i];
                if(currHBar - lastValue == 1){
                    current++;
                }else{
                    current = 0;
                }
                lastValue = currHBar;
                longestH = Math.max(current, longestH);

            }

            int longestV = 0;
            current = 0;
            lastValue = 0;
            for (int i = 0; i < vBars.length ; i++) {
                int currVBar = vBars[i];
                if(currVBar - lastValue == 1){
                    current++;
                }else{
                    current = 0;
                }
                lastValue = currVBar;
                longestV = Math.max(current, longestV);
            }


            longestV++;
            longestV++;
            longestH++;
            longestH++;

            return (int)Math.pow(Math.min(longestH, longestV), 2);

        }

}