package pl.aswit.leetcode.easy.task2500;

import java.util.Arrays;

public class Solution {

    //beats 99%
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int[] arr : grid) {
            Arrays.sort(arr);
        }
        for(int i = m - 1 ;i>=0;i--) {
            int max = 0;
            for(int j = 0; j<n; j++){
                int currentValue = grid[j][i];
                if(currentValue > max){
                    max = currentValue;
                }
            }
            sum += max;
        }
        return sum;
    }
    //beats 32%
    public int deleteGreatestValueWeak(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int[] arr : grid) {
            Arrays.sort(arr);
        }
        for(int i = m - 1 ;i>=0;i--) {
            int[] currentColumn = new int[n];
            for(int j = 0; j<n; j++){
                currentColumn[j] = grid[j][i];
            }
            sum += Arrays.stream(currentColumn).max().getAsInt();
        }
        return sum;
    }

}
