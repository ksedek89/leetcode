package pl.aswit.leetcode.medium.task6;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        char[][] tab = new char[s.length()][s.length()];

        int currentColumn = -1;
        int currentRow = 0;
        int rowIndex = numRows-2;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if((i) % (numRows+numRows-2) == 0){
                currentColumn++;
                currentRow = 0;
                rowIndex = numRows-2;
            }else if(i % (numRows+ numRows-2) >= numRows && i % (numRows+numRows-2) < numRows + numRows-2){
                currentColumn++;
                currentRow = rowIndex--;
            }

            tab[currentRow++][currentColumn] = currentChar;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if(tab[i][j] != '\u0000'){
                    sb.append(tab[i][j]);
                }
            }
        }
        return sb.toString();
    }

}


