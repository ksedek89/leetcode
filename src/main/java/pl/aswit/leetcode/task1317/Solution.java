package pl.aswit.leetcode.task1317;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    //beats 100%
    public int[] getNoZeroIntegers(int n) {
        int counter = 0;
        while (counter++ < n){
            if(!containsNumber(counter, 10) && !containsNumber(n-counter, 10))
                return new int[]{counter, n-counter};
        }
        return null;
    }

    boolean containsNumber(int num, int number) {
        while(num > 0) {
            if(num % 10 == number){
                return true;
            }
            num = num / 10;
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
