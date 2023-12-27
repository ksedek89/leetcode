package pl.aswit.leetcode.medium.task5;


public class Solution {


    public String longestPalindrome(String s) {
        int leftIndex = 0; int rightIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            int k = i;
            int j = i;

            while (k<s.length()-1 && s.charAt(k+1) == s.charAt(i)){
                k++;
            }
            while (j>0 && s.charAt(j-1) == s.charAt(i)){
                j--;
            }

            while (j > 0 && k < s.length() - 1 && s.charAt(j-1) == s.charAt(k+1)) {
                j--;k++;
            }
            if (k - j > rightIndex - leftIndex) {
                rightIndex = k;
                leftIndex = j;
            }
        }
        return s.substring(leftIndex, rightIndex+1);
    }

    public String longestPalindromeStr(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String currentPalindrome = "";
            int j = i, k = i;
            currentPalindrome = currentPalindrome + s.charAt(i);

            while (k<s.length()-1 && s.charAt(k+1) == s.charAt(i)){
                currentPalindrome = currentPalindrome + s.charAt(k+1);
                k++;
            }
            while (j>0 && s.charAt(j-1) == s.charAt(i)){
                currentPalindrome = currentPalindrome + s.charAt(j-1);
                j--;
            }

            while (j > 0 && k < s.length() - 1 && s.charAt(j-1) == s.charAt(k+1)) {
                currentPalindrome = s.charAt(j-1) + currentPalindrome + s.charAt(k+1);
                j--;k++;
            }
            if (currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }
        }

        return longestPalindrome;
    }
}
