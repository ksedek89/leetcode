package pl.aswit.leetcode.medium.task70;



public class Solution {

    public int climbStairs(int n) {
        int[] a = new int[n];

        return countTotal(0, n, a);
    }

    private int countTotal(int index, int n, int[] a) {
        if(index == n){
            return 1;
        }else if(index > n){
            return 0;
        }else if(a[index] != 0){
            return a[index];
        }


        a[index] = countTotal(index+1, n, a) + countTotal(index+2, n, a);
        return a[index];
    }
}


