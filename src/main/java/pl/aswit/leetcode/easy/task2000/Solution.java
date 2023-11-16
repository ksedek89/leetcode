package pl.aswit.leetcode.easy.task2000;

public class Solution {

    //beats 100%
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if(i < 0) {
            return word;
        }
        return reverse(word.substring(0, i+1)) + word.substring(i+1);

    }

    private String reverse(String substring) {
        StringBuilder sb = new StringBuilder();
        for(int i = substring.length()-1; i>=0; i--){
            sb.append(substring.charAt(i));
        }
        return sb.toString();
    }

}
