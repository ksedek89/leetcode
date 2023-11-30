package pl.aswit.leetcode.easy.task20;


import java.util.Stack;

public class Solution {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(isOpenChar(currentChar)){
                stack.push(currentChar);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character prevChar = stack.pop();
                if(!isOpposite(prevChar, currentChar)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private boolean isOpenChar(char char1){
        return char1 == '(' || char1 == '[' ||char1 == '{';
    }
    private boolean isOpposite(char char1, char char2){
        return (char1 == '(' && char2 == ')') || (char1 == '[' && char2 == ']') ||(char1 == '{' && char2 == '}');
    }
}

