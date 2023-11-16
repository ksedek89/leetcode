package pl.aswit.leetcode.easy.task2148;

import java.util.Arrays;
public class Solution {



    //beats 70%
    public int countElements(int[] nums) {
        if(nums.length < 2){
            return 0;
        }

        int disableNumberCnt = 0;
        Arrays.sort(nums);

        int firstElement = nums[0];
        int lastElement = nums[nums.length-1];

        for (int i = 0; i<  nums.length; i++) {
            if(nums[i] == firstElement){
                disableNumberCnt++;
            }else{
                break;
            }
        }
        for (int i = nums.length; i-- > 0; ) {
            if(nums[i] == lastElement){
                disableNumberCnt++;
            }else{
                break;
            }
        }
        int result = nums.length - disableNumberCnt;
        return result < 0? 0: result;
    }

    //beats 8%
    public int countElements8(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        return (int)Arrays.stream(nums).filter(e->e != max && e != min).count();
    }
}
