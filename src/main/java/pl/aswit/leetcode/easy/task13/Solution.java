package pl.aswit.leetcode.easy.task13;

public class Solution {


    //beats 85%
        public int romanToInt(String s) {
            int result = 0;
            char lastChar = s.charAt(s.length()-1);
            result += addNumber(lastChar);
            for (int i = s.length()-2; i >= 0; i--) {
                if(addNumber(s.charAt(i)) < addNumber(lastChar)){
                    result -= addNumber(s.charAt(i));
                }else{
                    result += addNumber(s.charAt(i));
                }
                lastChar = s.charAt(i);
            }

            return result;
        }

        private int addNumber(char lastChar) {
            switch (lastChar){
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
            }
            return -1;
        }
}

