package pl.aswit.leetcode.easy.task1323;



public class Solution {

    //beats 100%
    public int maximum69Number (int num) {
        String inputString = String.valueOf(num);
        char[] chars = inputString.toCharArray();
        for(int i = 0; i<chars.length; i++){
            if(chars[i] == '6'){
                chars[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }

    //beats 20%
    public int maximum69Number20 (int num) {
        String input = String.valueOf(num);
        input = input.replaceFirst("6", "9");
        return Integer.valueOf(input);
    }
}