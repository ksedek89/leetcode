package pl.aswit.leetcode.medium.task935;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    //beats 58%
    int[][] values;
    int MOD = (int) 1e9 + 7;
    int[][] jumps = {
            {4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {3, 9, 0},
            {},
            {1, 7, 0},
            {2, 6},
            {1, 3},
            {2, 4}
    };


    public int knightDialer(int n) {
        int counter = 0;
        values = new int[n + 1][10];

        for (int i = 0; i < 10; i++) {
            int counter1 = getCounter(i, n);
            counter = (counter1 + counter) % MOD;
        }
        return counter;
    }


    public int getCounter(int currentNumber, int n) {
        int counter = 0;


        if (values[n][currentNumber] != 0) {
            return values[n][currentNumber];
        }

        if(n>1){
            int[] ints = jumps[currentNumber];
            for(int a: ints){
                 counter = (counter + getCounter(a, n-1)) % MOD;
            }

        }
        if(n==1){
            return 1;
        }
        values[n][currentNumber] = counter;

        return counter;
    }


}


