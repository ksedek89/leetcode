package pl.aswit.leetcode.easy.task190;

public class Solution {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int currentBit = n & 1;
            int currentValue = currentBit << (31 - i);
            result = result | currentValue;

            n = n>>1;
        }


        return result;

    }

}
