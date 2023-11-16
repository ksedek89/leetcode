package pl.aswit.leetcode.easy.task1009;


public class Solution {

//   also interesting: https://leetcode.com/problems/complement-of-base-10-integer/solutions/1319086/java-one-liner-100-faster-solution-explaination/

    //beats 100%
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int res=0, fac=1;
        while(n!=0){
            res += fac * (n%2 ==0 ? 1:0);
            fac*=2;
            n/=2;
        }
        return res;
    }


    //beats 20%
    public int bitwiseComplement1(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i<chars.length; i++){
            char currentChar = chars[i];
            sb.append(currentChar == '1' ? '0': '1');
        }

        return (Integer.parseInt(sb.toString(), 2));

    }
}
