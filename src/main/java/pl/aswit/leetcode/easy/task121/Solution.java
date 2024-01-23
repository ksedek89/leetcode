package pl.aswit.leetcode.easy.task121;

import java.util.Arrays;

public class Solution {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            minPrice = Math.min(minPrice, currentPrice);
            if(currentPrice - minPrice > maxProfit){
                maxProfit = currentPrice - minPrice;
            }
        }

        return maxProfit;

    }

}
