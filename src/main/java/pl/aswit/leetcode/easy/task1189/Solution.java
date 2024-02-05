package pl.aswit.leetcode.easy.task1189;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int maxNumberOfBalloons(String text) {
        int[] counter = new int[5];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            switch (currentChar) {
                case 'b':
                    counter[0] = counter[0] + 2;
                    break;
                case 'a':
                    counter[1] = counter[1] + 2;
                    break;
                case 'l':
                    counter[2] = counter[2] + 1;
                    break;
                case 'o':
                    counter[3] = counter[3] + 1;
                    break;
                case 'n':
                    counter[4] = counter[4] + 2;
                    break;
                default:
                    break;
            }
        }

        int min = Integer.MAX_VALUE;
        System.out.println(counter[0]);
        System.out.println(counter[1]);
        System.out.println(counter[2]);
        System.out.println(counter[3]);
        System.out.println(counter[4]);
        for (int i = 0; i < counter.length; i++) {
            min = Math.min(min, counter[i]/2);
        }

        return min;

    }
}
