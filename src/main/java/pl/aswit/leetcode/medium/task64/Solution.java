package pl.aswit.leetcode.medium.task64;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int minPathSum(int[][] grid) {
        int[][] sum = new int[grid.length][grid[0].length];

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == 0 && j == 0){
                    sum[i][j] = grid[i][j];
                }else if(i == 0){
                    sum[i][j] = grid[i][j] + sum[i][j-1];
                }else if(j == 0){
                    sum[i][j] = grid[i][j] + sum[i-1][j];
                }else{
                    sum[i][j] = Math.min(sum[i-1][j], sum[i][j-1]) + grid[i][j];
                }
            }
        }


        return sum[grid.length-1][grid[0].length-1];
    }
}


