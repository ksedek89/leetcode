package pl.aswit.leetcode.medium.task931;


import java.util.Arrays;

public class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int [][] matrixTemp;
            matrixTemp = initMatrix(matrix);
            for (int j = 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    if(k == 0){
                        matrixTemp[j][k] = Math.min(matrixTemp[j-1][k], matrixTemp[j-1][k+1]) + matrix[j][k];
                    }else if(k == matrix[0].length -1){
                        matrixTemp[j][k] = Math.min(matrixTemp[j-1][k], matrixTemp[j-1][k-1]) + matrix[j][k];
                    }else{
                        matrixTemp[j][k] = Math.min(Math.min(matrixTemp[j-1][k+1], matrixTemp[j-1][k]), matrixTemp[j-1][k-1]) + matrix[j][k];
                    }
                }
            }

        return Arrays.stream(matrixTemp[matrix.length-1]).min().getAsInt();

    }

    private  int[] []  initMatrix(int[][] matrix) {
        int[][] matrixTemp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == 0){
                    matrixTemp[i][j] = matrix[i][j];
                }else{
                    matrixTemp[i][j] = 0;
                }
            }
        }
        return matrixTemp;
    }

}


