package pl.aswit.leetcode.task1704;

public class Solution {
    private char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public boolean halvesAreAlike(String s) {
        int length = s.length();
        char[] signs = s.toCharArray();
        int aVovels = 0, bVovels = 0;
        for(int i = 0; i<length/2; i++){
            if(isVovel(signs[i])){
                aVovels++;
            }
            if(isVovel(signs[length-i-1])){
                bVovels++;
            }
        }
        return aVovels == bVovels;
    }

    boolean isVovel(char sign){
        for(char a: vowels){
            if(a == sign){
                return true;
            }
        }
        return false;
    }
}
