package pl.aswit.leetcode.medium.task1727;

import java.util.Arrays;

public class Solution {


    public int largestSubmatrix(int[][] matrix) {
        int result = 0;
        int[][] temp = new int[matrix.length][matrix[0].length];

        temp[0] = matrix[0];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if(matrix[j][i] == 1)
                temp[j][i] = temp[j-1][i] + 1;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            int[] currentArray = temp[i];
            Arrays.sort(currentArray);
            int counter = 1;
            for (int j = currentArray.length-1; j >= 0; j--) {
                result = Math.max(result, currentArray[j] * counter++);
            }

        }


        return result;
    }

}


