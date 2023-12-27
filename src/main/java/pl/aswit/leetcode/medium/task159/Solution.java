package pl.aswit.leetcode.medium.task159;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();
        int currentLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            Integer orDefault = map.getOrDefault(currentChar, 0);
            if(orDefault == 0){
                if(map.size() == 2){
                    char lastKey = getLastKey(map, s.charAt(i-1));
                    currentLength = 0;
                    char prevSign = s.charAt(i-1);
                    int j = i-1;
                    while (j >= 0 && s.charAt(j--) == prevSign){
                        currentLength++;
                    }
                    map.remove(lastKey);
                }
                currentLength++;
                map.put(currentChar, 1);
            }else {
                currentLength++;
            }
            longest = Math.max(longest, currentLength);
        }
        return longest;
    }

    private char getLastKey(Map<Character, Integer> map, char currentChar){
            for (char key : map.keySet()) {
                if(key != currentChar){
                    return key;
                }
            }
        return currentChar;
    }

}


