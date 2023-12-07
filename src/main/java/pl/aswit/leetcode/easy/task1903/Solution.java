package pl.aswit.leetcode.easy.task1903;

public class Solution {

    public String largestOddNumber(String num) {
        while (num != ""){
            if(num.charAt(num.length()-1) % 2 == 1){
                return num;
            }else{
                num = num.substring(0, num.length()-1);
            }
        }
        return "";
    }

}
