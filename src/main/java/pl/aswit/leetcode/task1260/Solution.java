package pl.aswit.leetcode.task1260;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    //beats 73%
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int length = m*n;

        int shift = k % length;

        //flat
        List flattedArray = new ArrayList();
        for(int[] a: grid){
            for(int b: a){
                flattedArray.add(b);
            }
        }


        //shift
        List flattedShiftArray = new ArrayList();
        for(int i = length - shift;  i < length; i++){
            flattedShiftArray.add(flattedArray.get(i));
        }

        for(int i = 0; i < length-shift;i++){
            flattedShiftArray.add(flattedArray.get(i));
        }

        //unflat
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 0; i < length; i = i + n){
            resultList.add(flattedShiftArray.subList(i, i+n));
        }
        return resultList;
    }



/*    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = k % (m * n);
        int index = k;
        int[] temp = new int[k];

        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(index > 0) temp[--index] = grid[i][j];
                else grid[i + (j + k) / n][(j + k) % n] = grid[i][j];
            }
        }

        int lastRow = k / n;

        for(int i = 0; i <= lastRow; i++){
            for(int j = 0; j < (i == lastRow ? k % n : n); j++){
                grid[i][j] = temp[index++];
            }
        }

        return (List)Arrays.asList(grid);
    }*/
}
