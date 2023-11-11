package pl.aswit.leetcode.task1967;

public class Solution {

    //beats 100%
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for(String a: patterns){
            if(word.contains(a)){
                counter++;
            }
        }
        return counter;
    }

}
