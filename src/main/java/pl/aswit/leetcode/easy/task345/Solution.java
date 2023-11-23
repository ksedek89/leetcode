package pl.aswit.leetcode.easy.task345;



public class Solution {

    //beats 55%
    public String reverseVowels(String s) {
        int currIndex = 0;
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(isVowel(currChar)){
                chars[currIndex++] = currChar;
            }
        }

        int counterBck = currIndex - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if(isVowel(currChar)){
                sb.append(chars[counterBck--]);
            }else{
                sb.append(currChar);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char character){
        return character ==  'a' || character ==  'e' || character ==  'i' || character ==  'o' || character ==  'u' ||
                character ==  'A' || character ==  'E' || character ==  'I' || character ==  'O' || character ==  'U';
    }

}