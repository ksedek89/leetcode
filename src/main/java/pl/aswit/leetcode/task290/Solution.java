package pl.aswit.leetcode.task290;


import java.util.HashMap;

public class Solution {

    //beats 100%
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i = 0; i<words.length; i++){
            char currentChar = pattern.charAt(i);
            String currentMapValue = map.get(currentChar);
            String currentWord = words[i];
            if(currentMapValue == null){
                if(map.containsValue(currentWord)){
                    return false;
                }
                map.put(currentChar, currentWord);
            }else{
                if(!currentMapValue.equals(currentWord)){
                    return false;
                }
            }
        }
        return true;
    }


}
