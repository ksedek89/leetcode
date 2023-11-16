package pl.aswit.leetcode.easy.task2639;

public class Solution {


    //beats 89%
    public int[] findColumnWidth(int[][] grid) {
        int[] output = new int[grid[0].length];
        for(int i=0;i<grid[0].length; i++){
            int currentLength = Integer.MIN_VALUE;
            for(int j=0; j < grid.length; j++){
                int length = calculateLength(grid[j][i]);
                if(length > currentLength){
                    currentLength = length;
                }
            }
            output[i] = currentLength;
        }
        return output;

    }

    private int calculateLength(int i) {
        int count = 1;
        while (i / 10 !=0){
            count++;
            i /=10;
        }
        if(i<0){
            count++;
        }
        return count;
    }

}
