package pl.aswit.leetcode.easy.task2085;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //beats 65%
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> word1Map = new HashMap<>();
        HashMap<String, Integer> word2Map = new HashMap<>();
        for(String word1: words1){
            Integer count = word1Map.get(word1);
            if(count != null){
                word1Map.put(word1, count+1);
            }else{
                word1Map.put(word1, 1);
            }

        }
        for(String word2: words2){
            Integer count = word2Map.get(word2);
            if(count != null){
                word2Map.put(word2, count+1);
            }else{
                word2Map.put(word2, 1);
            }
        }

        int count = 0;
        for(Map.Entry<String, Integer> a: word2Map.entrySet()){
            String key = a.getKey();
            if(a.getValue() == 1){
                Integer word1Key = word1Map.get(key);
                if(word1Key!= null && word1Key== 1){
                    count++;
                }
            }
        }

        return count;
    }
}
