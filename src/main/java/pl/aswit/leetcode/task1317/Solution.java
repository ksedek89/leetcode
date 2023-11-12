package pl.aswit.leetcode.task1317;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    //beats 100%
    public int[] getNoZeroIntegers(int n) {
        int counter = 0;
        while (counter++ < n){
            if(!containsZero(counter) && !containsZero(n-counter))
                return new int[]{counter, n-counter};
        }
        return null;
    }

    boolean containsZero(int num) {
        if(num == 0)
            return true;

        if(num < 0)
            num = -num;

        while(num > 0) {
            if(num % 10 == 0)
                return true;
            num /= 10;
        }
        return false;
    }

    //beats 38%
    public int[] getNoZeroIntegers38(int n) {
        int counter = 0;
        while (counter++ < n){
            if(!String.valueOf(counter).contains("0") && !String.valueOf(n-counter).contains("0")){
                return new int[]{counter, n-counter};
            }
        }
        return null;
    }

}
