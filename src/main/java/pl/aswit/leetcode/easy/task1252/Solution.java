package pl.aswit.leetcode.easy.task1252;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int[] currentIncrement = indices[i];
            int row = currentIncrement[0];
            int column = currentIncrement[1];

            for(int j = 0; j < array.length; j++){
                array[j][column] = array[j][column] + 1;
            }
            for(int j = 0; j < array[0].length; j++){
                array[row][j] = array[row][j] + 1;
            }

        }


        int total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
                if(array[i][j] % 2 == 1){
                    total++;
                }
            }
        }

        return total;

    }
}
