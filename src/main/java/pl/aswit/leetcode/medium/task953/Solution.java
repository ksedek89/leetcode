package pl.aswit.leetcode.medium.task953;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }
        for(int i = 1; i < words.length; i++){
            for (int j = 0; j < Math.max(words[i].length(), words[i-1].length()); j++) {
                if(j == words[i].length()){
                    return false;
                }else if(j == words[i-1].length()){
                    break;
                }else if(orderMap.get(words[i].charAt(j)) > orderMap.get(words[i-1].charAt(j))){
                    break;
                }else if(orderMap.get(words[i].charAt(j)) < orderMap.get(words[i-1].charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }

}

