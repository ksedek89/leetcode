package pl.aswit.leetcode.easy.task2278;



public class Solution {


    //beats 100%
    public int percentageLetter(String s, char letter) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                counter++;
            }

        }

        return Math.round(counter * 100 / s.length());
    }

}
