package pl.aswit.leetcode.easy.task225;



public class Solution {

    // n ->
    // 1 -> 1 => 0 -> 0
    // 2 -> 10 => 1-> 01
    // 4 -> 100 => 3-> 011
    // 8 -> 1000 => 7 -> 0111
    // n -> 10000000.... => n-1 -> 01111111......
    // n & n-1 => 00000000......
    //beats 100%
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    //beats 85%
    public boolean isPowerOfTwoSlow(long n) {
        if(n == 0){
            return false;
        }
        if(n == 1 ){
            return true;
        }
        long temp = n;
        long fact = 1;
        while (temp > 0){
            fact = 2 * fact;
            temp /= 2;
        }
        fact = fact/2;

        return fact == n;
    }
}