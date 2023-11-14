package pl.aswit.leetcode.task205;

import java.util.HashMap;
import java.util.Map;

public class Solution {




    //beats 72%
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            Character o = map.get(s.charAt(i));
            if(o == null){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }else{
                if(o != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    //interesting solution
    public boolean isIsomorphicDifferentApproach(String s, String t) {
        int[] m = new int[256];
        int[] n = new int[256];
        for(int i = s.length()-1; i >=0 ; i--){
            char j = s.charAt(i), k = t.charAt(i);
            if(m[j] != n[k])
                return false;
            m[j] = n[k] = i ;
        }
        return true;
    }


}
