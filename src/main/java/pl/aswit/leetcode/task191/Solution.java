package pl.aswit.leetcode.task191;

public class Solution {

    //beats 100%
    public int hammingWeight(int n) {
        int counter = 0;
        while (n != 0){
            counter += n&1;
            n = n>>>1;
        }
        return counter;
    }

    public int hammingWeight32(int n) {
        String s = Integer.toBinaryString(n);
        return s.replaceAll("0", "").length();
    }


}
