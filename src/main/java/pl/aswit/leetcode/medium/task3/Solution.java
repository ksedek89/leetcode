package pl.aswit.leetcode.medium.task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution {


    //beats 85%
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList();
        int max = 0;
        for(int i = 0; i< s.length() ; i++){
            char c = s.charAt(i);
            int index = containsCharacter(list, c);
            if(index <0){
                list.add(c);
            }else{
                for(int j = 0; j <= index; j++){
                    list.remove(0);
                }
                list.add(c);
            }
            int size = list.size();
            max = Math.max(size, max);
        }

        return max;
    }

    private int containsCharacter(List<Character> list, char c){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).equals(c)){
                return i;
            }
        }
        return -1;
    }
}


