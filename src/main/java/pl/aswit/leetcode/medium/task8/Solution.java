package pl.aswit.leetcode.medium.task8;

public class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();
        boolean signExists = false;
        boolean hasDigit = false;
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if((currentChar >= '0' && currentChar <= '9') ){
                sb.append(currentChar);
                hasDigit = true;
                long currentLong = Long.valueOf(sb.toString());
                if (currentLong < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                if (currentLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }else if(currentChar == '+' || currentChar == '-'){
                if(!signExists && i == 0){
                    sb.append(currentChar);
                    signExists = true;
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        if(sb.toString().length() == 0 || !hasDigit){
            return 0;
        }
        return Integer.valueOf(sb.toString());
    }
}


