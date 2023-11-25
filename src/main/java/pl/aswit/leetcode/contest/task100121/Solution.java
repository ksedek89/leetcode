package pl.aswit.leetcode.contest.task100121;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    //task2942

    //    https://leetcode.com/contest/biweekly-contest-118/problems/find-words-containing-character/
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1 ){
                list.add(i);
            }
        }
        return list;
    }

}