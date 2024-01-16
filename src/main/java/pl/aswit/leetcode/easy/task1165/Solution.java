package pl.aswit.leetcode.easy.task1165;


import java.util.Arrays;

public class Solution {

    public int calculateTime(String keyboard, String word) {
        int counter = 0;
        int lastIndex = 0;
        boolean found;
        int counter2;
        for (int i = 0; i < word.length(); i++) {
            counter2 = counter;
            found = false;
            if(word.charAt(i) == keyboard.charAt(lastIndex)){
                continue;
            }
            for (int j = lastIndex+1; j < keyboard.length(); j++) {
                counter++;
                if(word.charAt(i) == keyboard.charAt(j)){
                    lastIndex = j;
                    found = true;
                    break;
                }
            }
            if(!found){
                counter = counter2;
                for (int j = lastIndex-1; j >= 0; j--) {
                    counter++;
                    if(word.charAt(i) == keyboard.charAt(j)){
                        lastIndex = j;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
