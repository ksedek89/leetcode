package pl.aswit.leetcode.medium.task8;

public class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();
        boolean signExists = false;
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if((currentChar >= '0' && currentChar <= '9') ){
                sb.append(currentChar);
                long currentLong = Long.valueOf(sb.toString());
                if (currentLong < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                if (currentLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }else if(i == 0){
                if(currentChar == '+' || currentChar == '-'){
                    if(!signExists){
                        sb.append(currentChar);
                        signExists = true;
                    }else{
                        return 0;
                    }
                }else{
                    return 0;
                }
            }else if(currentChar == '+' || currentChar == '-'){
                if(!signExists){
                    if(i == 0){
                        sb.append(currentChar);
                        signExists = true;
                    }

                }else{
                    break;
                }
                break;
            }else{
                break;
            }
        }
        if(sb.toString().length() == 0){
            return 0;
        }

        try {
            long currentLong = Long.valueOf(sb.toString());
            if (currentLong < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (currentLong > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return Integer.valueOf(sb.toString());
        }catch (Exception e){
            return 0;
        }
    }
}


