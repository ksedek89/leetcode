package pl.aswit.leetcode.medium.task7;

public class Solution {

    public int reverse(int x) {
        boolean negative = x < 0;
        int number = 0;
        int prevNumber;
        while (x != 0){
            prevNumber = number;
            number = number * 10 + x % 10;
            if((!negative &&  prevNumber>0 && Math.abs(number % prevNumber) > 10) || (negative && prevNumber < 0 && Math.abs(number % prevNumber)> 10)){
                return 0;
            }
            x = x/10;
        }
        return number;
    }


}


