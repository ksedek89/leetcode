package pl.aswit.leetcode.easy.task1217;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int minCostToMoveChips(int[] position) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < position.length; i++) {
            if(position[i] % 2 == 0){
                sumOdd++;
            }else{
                sumEven++;
            }
        }

        return Math.min(sumOdd, sumEven);
    }
}
