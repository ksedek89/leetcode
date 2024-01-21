package pl.aswit.leetcode.easy.task476;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

/*    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binaryString.length() ; i++) {
            if(binaryString.charAt(i) == '1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }*/

    public int findComplement(int num) {
        int n = 0;
        while (n < num) {
            n = (n << 1) | 1;
        }
        return n - num;
    }
}