package pl.aswit.leetcode.easy.task1688;



public class Solution {

    public int numberOfMatches(int n) {
        int matches = 0;
        while (n != 1){
            matches += n/2;
            n = (n % 2 == 1)? n/2+1 : n/2;
        }
        return matches;
    }
}
