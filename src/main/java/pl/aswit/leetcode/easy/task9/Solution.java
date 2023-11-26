package pl.aswit.leetcode.easy.task9;

import java.util.HashMap;
import java.util.Map;



public class Solution {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reversed = 0;
        int temp = x;

        while (temp != 0){
            reversed = reversed * 10 + temp %10;
            temp /= 10;
        }

        return reversed == x;
    }

    public boolean isPalindromeStr(int x) {
        String input = String.valueOf(x);
        int length = input.length() ;
        for(int i = 0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(length-1 - i)){
                return false;
            }
        }
        return true;
    }
}

