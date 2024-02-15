package pl.aswit.leetcode.easy.task661;


import java.util.Arrays;
import java.util.EnumSet;

public class Solution {

    public int[][] imageSmoother(int[][] img) {


        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(img[i][j]);
                int total = 0;
                int noOfElements = 0;

                for (int k = i-1; k <= i+1; k++) {
                    for (int k2 = j-1; k2 <= j+1; k2++) {
                        if(k >= 0 && k < m && k2 >=0 && k2 < n){
                            total+= img[k][k2];
                            noOfElements++;
                        }
                    }
                }
                int average = total/noOfElements;
                result[i][j] = average;

            }
        }

        return result;
    }

}
