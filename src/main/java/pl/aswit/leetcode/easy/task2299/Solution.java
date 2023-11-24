package pl.aswit.leetcode.easy.task2299;



public class Solution {

    final static String SPECIAL_SIGNS = "!@#$%^&*()-+";


    //beats 100%
    public boolean strongPasswordCheckerII(String password) {
        boolean containsBigLetter = false;
        boolean containsSmallLetter = false;
        boolean containsDigit = false;
        boolean containsSpecial = false;

        char lastChar = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (!containsBigLetter) {
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    containsBigLetter = true;
                }
            }
            if (!containsSmallLetter) {
                if (currentChar >= 'a' && currentChar <= 'z') {
                    containsSmallLetter = true;
                }
            }
            if (!containsDigit) {
                if (currentChar >= '0' && currentChar <= '9') {
                    containsDigit = true;
                }
            }
            if (!containsSpecial) {
                if (SPECIAL_SIGNS.indexOf(currentChar) != -1) {
                    containsSpecial = true;
                }
            }
            if (currentChar == lastChar) {
                return false;
            }
            lastChar = currentChar;
        }

        return password.length() >= 8
                && containsBigLetter
                && containsSmallLetter
                && containsDigit
                && containsSpecial;
    }

}
