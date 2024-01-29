package pl.aswit.leetcode.easy.task19;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }

        String s = String.valueOf(n);
        return calculate(s);
    }

    private boolean calculate(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer i1 = Integer.valueOf(s.substring(i, i + 1));
            result += i1*i1;
        }
        if(s.equals(String.valueOf(result)) || set.contains(result)){
            return false;
        }else if(result == 1){
            return true;
        }
        set.add(result);
        return calculate(String.valueOf(result));
    }
}

