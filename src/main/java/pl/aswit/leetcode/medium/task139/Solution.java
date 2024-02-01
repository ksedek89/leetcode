package pl.aswit.leetcode.medium.task139;

import java.util.List;

public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        outer: while (s.length() != 0) {
            for (int i = 0; i < wordDict.size(); i++) {
                if(s.startsWith(wordDict.get(i))){
                    s = s.substring(wordDict.get(i).length(), s.length());
                    continue outer;
                }
            }
            return false;
        }

        return true;
    }
}


