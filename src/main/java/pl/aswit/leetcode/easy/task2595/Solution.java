package pl.aswit.leetcode.easy.task2595;

public class Solution {


    public int[] evenOddBit(int n) {
        int odd = 0;
        int even = 0;
        int counter =0;
        while(n>0){
            if(n % 2 == 1){
                if(counter% 2 == 1){
                    odd++;
                }else{
                    even++;
                }
            }
            n /= 2;
            counter++;
        }
        return new int[]{even, odd};
    }

}
