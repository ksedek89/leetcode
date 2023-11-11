package pl.aswit.leetcode.task1614;

import java.util.Stack;


public class Solution {


    //beats 100%
    public int maxDepth(String s) {
        int counter = 0;
        int max = 0;

        for(char character : s.toCharArray()){
            if(character == '('){
                counter++;
                max = max > counter ? max : counter;
            }else if(character == ')') {
                counter--;
            }
        }
        return max;
    }


    //beats 37%
    public int maxDepthStack(String s) {
        int maxStackSize = 0;
        Stack<Character> stack = new Stack<>();

        for(char character : s.toCharArray()){
            if(character == '('){
                stack.push(character);
                if(stack.size() > maxStackSize){
                    maxStackSize = stack.size();
                }
            }else if(character == ')') {
                stack.pop();
            }
        }
        return maxStackSize;
    }

}
