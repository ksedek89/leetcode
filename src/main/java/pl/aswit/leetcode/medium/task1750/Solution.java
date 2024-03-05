package pl.aswit.leetcode.medium.task1750;

public class Solution {

    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        char leftChar;
        char rightChar;
        int total = 0;
        while(left<right){
            leftChar = s.charAt(left++);
            rightChar = s.charAt(right--);
            if(leftChar != rightChar){
                return s.length()-total;
            }else{
                total +=2;
                while(left < s.length() && s.charAt(left) == leftChar ){
                    left++;
                    total++;
                }
                while(right >=0 && s.charAt(right) == rightChar ){
                    right--;
                    total++;
                }
            }
        }
        return s.length()-total < 0 ? 0 : s.length()-total;
    }

}


