package pl.aswit.leetcode.easy.task28;



public class Solution {

    public int strStr(String haystack, String needle) {
        int result = -1;

        outer: for(int i = 0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int index = i;
                int haystackCounter = i;
                for (int j = 0; j < needle.length(); j++) {
                    if(haystackCounter>=haystack.length()){
                        continue outer;
                    }
                    if(haystack.charAt(haystackCounter++) != needle.charAt(j)){
                        continue outer;
                    }
                }
                return index;

            }
        }

        return result;
    }
}

