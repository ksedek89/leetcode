package pl.aswit.leetcode.easy.task14;



public class Solution {


    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar =  strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(i < strs[j].length()){
                    if(strs[j].charAt(i) != currentChar){
                        return sb.toString();
                    }
                }else{
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }

}

