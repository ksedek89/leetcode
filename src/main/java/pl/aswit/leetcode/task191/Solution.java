package pl.aswit.leetcode.task191;

public class Solution {

    public int hammingWeight(int n) {
        int counter = 0;
        while (n != 0){
            counter += n&1;
            n = n>>>1;
        }
        return counter;
    }

    public int hammingWeightHammer(int n) {
        String s = Integer.toBinaryString(n);
        return s.replaceAll("0", "").length();
    }


}
