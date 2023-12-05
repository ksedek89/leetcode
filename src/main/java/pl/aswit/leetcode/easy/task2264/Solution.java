package pl.aswit.leetcode.easy.task2264;


public class Solution {

    public String largestGoodInteger(String num) {
        char biggestChar = ',';
        int counter = 1;
        char lastChar = ',';
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if(c == lastChar){
                counter++;
                if(counter == 3 && c > biggestChar){
                    biggestChar = c;
                }
            }else{
                counter = 1;
                lastChar = c;
            }
        }

        if(biggestChar == ','){
            return "";
        }else{
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                stringBuilder.append(biggestChar);
            }
            return stringBuilder.toString();
        }
    }


}
