package pl.aswit.leetcode.medium.task17;

import java.util.*;

public class Solution {

    Map<Character, Character[]> map = Map.of(
            '2', new Character[] {'a', 'b', 'c'},
            '3', new Character[] {'d', 'e', 'f'},
            '4', new Character[] {'g', 'h', 'i'},
            '5', new Character[] {'j', 'k', 'l'},
            '6', new Character[] {'m', 'n', 'o'},
            '7', new Character[] {'p', 'q', 'r', 's'},
            '8', new Character[] {'t', 'u', 'v'},
            '9', new Character[] {'w', 'x', 'y', 'z'} );
    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();

        if(digits.length() == 0){
            return resultList;
        }

        prepare(resultList, new StringBuilder(), 0, digits);
        return resultList;
    }

    private void prepare(List<String> resultList, StringBuilder stringBuilder, int index, String digits) {
        if(index == digits.length()){
            resultList.add(stringBuilder.toString());
            return;
        }

        Character[] characters = map.get(digits.charAt(index));
        for(Character c: characters){
            stringBuilder.append(c);
            prepare(resultList, stringBuilder, index+1, digits);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }


}


