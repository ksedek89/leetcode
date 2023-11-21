package pl.aswit.leetcode.medium.task1814;


import java.util.HashMap;
public class Solution {

    //beats 99%
    public int countNicePairs(int[] nums) {
        long result = 0;
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] - reverseNumber(nums[i]);
        }

        var mod = Math.pow(10, 9) + 7;


        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i<nums.length; i++){
            int curNum = nums[i];
            Integer i1 = map.get(nums[i]);
            if(i1 == null){
                map.put(curNum, 1);
            }else{
                map.put(curNum, i1+1);
                result = result + i1;
            }
        }
        return (int)(result % (mod));
    }

    int reverseNumber(int num){
        int reversedInt = 0 ;
        while (num > 0){
            reversedInt = reversedInt * 10 + num % 10;
            num /= 10;
        }
        return reversedInt;
    }


    //slow - doesn't work

    public int countNicePairsDoesntwork(int[] nums) {
        int result = 0;
        long[] numsReversed = new long[nums.length];
        for(int i = 0; i<nums.length; i++){
            numsReversed[i] = reverseNumber(nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + numsReversed[j] == nums[j] + numsReversed[i]){
                    result++;
                }
            }
        }

        var mod = Math.pow(109, 9) + 7;
        return (int)(result % (mod));
    }

    int reverseNumberString(int num){
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(num);
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }


}


