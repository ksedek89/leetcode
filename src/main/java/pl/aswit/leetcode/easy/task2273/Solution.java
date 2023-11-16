package pl.aswit.leetcode.easy.task2273;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //beats 62%
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        List<String> listSorted = new ArrayList<>();
        for(String word: words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            listSorted.add(new String(chars));
        }

        list.add(words[0]);
        for(int i = 1; i < words.length; i++){
            if(!listSorted.get(i).equals(listSorted.get(i-1))){
                list.add(words[i]);
            }
        }
        return list;
    }


}
