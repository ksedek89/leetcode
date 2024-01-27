package pl.aswit.leetcode.easy.task125;

public class Solution {

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        char leftChar;
        char rightChar;
        if(r == 1){
            return true;
        }
        while(l<r){
            leftChar = s.charAt(l);
            rightChar = s.charAt(r);

            if(!isValid(leftChar)){
                l++;
                continue;
            }
            if(!isValid(rightChar)){
                r--;
                continue;
            }
            if(charConvertToUpper(leftChar) != charConvertToUpper(rightChar)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }

    private char charConvertToUpper(char a){
        if(a >= 'a' && a <= 'z'){
            return Character.toUpperCase(a);
        }
        return a;
    }

    private boolean isValid(char a){
        return (a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z')|| (a >= 'a' && a <= 'z');
    }
}
