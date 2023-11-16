package pl.aswit.leetcode.easy.task1021;

import java.util.Stack;

public class Solution {


    //beats 100%

    //not necessary to use stack, here is the same method like in stack.
    //if the counter is > 0 we are inside
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char[] charArray = s.toCharArray();
        for(int i = 0; i<charArray.length; i++ ){
            if((charArray[i] == '(' && counter++ > 0) || (charArray[i] == ')' && --counter > 0)){
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }



    //use stack, beats 20%
    public String removeOuterParenthesesStack(String s) {
        Stack<String> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringBuilder  tempString = new StringBuilder();
        for (int i = 0; i< s.length(); i++){
            String currentString = s.substring(i, i+1);
            if(currentString.equals("(")){
                tempString.append(currentString);
                stack.push(currentString);
            }else{
                String pop = stack.pop();
                tempString.append(currentString);

                if(stack.isEmpty()){
                    sb.append(tempString.substring(1, tempString.length()-1));
                    tempString = new StringBuilder();

                }
            }

        }
        return sb.toString();
    }

}
