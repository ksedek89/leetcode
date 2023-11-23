package pl.aswit.leetcode.easy.task326;



public class Solution {

//    https://leetcode.com/problems/power-of-three/editorial/
    public boolean isPowerOfThree(int n) {
        https://www.chilimath.com/lessons/advanced-algebra/logarithm-rules/
//        logbX = log10X/log10b
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }

    public boolean isPowerOfThreeBaseConversion(int n) {
        return Integer.toString(1, 3).matches("^10*$");
    }
}