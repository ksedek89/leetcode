package pl.aswit.leetcode.easy.task917;


public class Solution {

    public String revert(String input) {
        char[] response = new char[input.length()];
        int left = 0;
        int right = input.length()-1;
        char currLeft;
        char currRight;
        while (left <= right){
            currLeft = input.charAt(left);
            currRight = input.charAt(right);
            if(!isLetter(currLeft)){
                response[left] = currLeft;
                left++;
            }else if(!isLetter(currRight)){
                response[right] = currRight;
                right--;
            }else{
                response[right] = currLeft;
                response[left] = currRight;
                left++;
                right--;

            }

        }

        return new String(response);
    }

    private boolean isLetter(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
