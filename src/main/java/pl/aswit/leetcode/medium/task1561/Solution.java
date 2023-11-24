package pl.aswit.leetcode.medium.task1561;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //beats 41%
    public int maxCoins(int[] piles) {
        int coins = 0;
        Arrays.sort(piles);

        int highCounter = piles.length - 1;
        for (int i = 0; i < piles.length; i=i+3) {
            coins += piles[highCounter-1];
            highCounter = highCounter - 2;
        }

        return coins;
    }

}


