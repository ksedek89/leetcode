package pl.aswit.leetcode.task2138;

public class Solution {


    //beats 98%
    public String[] divideString(String s, int k, char fill) {
        int stringLength = s.length();
        int length = stringLength / k;
        int rest = stringLength % k;

        if(rest > 0){
            length++;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<k-rest; i++){
                sb.append(fill);
            }
            s = s + sb.toString();
        }

        String[] output = new String[length];
        for(int i = 0; i < s.length(); i=i+k){
            output[i/k] = s.substring(i, i+k);
        }

        return output;
    }
}
