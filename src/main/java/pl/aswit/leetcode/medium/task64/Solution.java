package pl.aswit.leetcode.medium.task64;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int minPathSum(int[][] grid) {
        int[][] sum = new int[grid.length][grid[0].length];
        return fillMatrix(0,0,grid, sum);


    }

    private int fillMatrix(int i, int j, int[][] grid, int[][] sum) {
        if(i==grid.length || j == grid[0].length){
            return Integer.MAX_VALUE;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        if(sum[i][j] != 0){
            return sum[i][j];
        }
        int nextDown = fillMatrix(i+1, j, grid, sum);
        int nextRight = fillMatrix(i, j+1, grid, sum);

        sum[i][j] = Math.min(nextRight, nextDown) + grid[i][j];
        return sum[i][j];
    }



    public int minPathSumOld(int[][] grid) {
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


