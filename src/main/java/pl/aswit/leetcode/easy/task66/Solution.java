package pl.aswit.leetcode.easy.task66;


public class Solution {

    public int[] plusOne(int[] digits) {
        int advance = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            int currentInt = digits[i] + advance;
            if(i == digits.length-1){
                currentInt++;
            }
            if(currentInt == 10){
                advance = 1;
                digits[i] = 0;
            }else {
                digits[i] = currentInt;
                advance = 0;

            }
        }

        if(advance == 1){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }

        return digits;
    }
}

