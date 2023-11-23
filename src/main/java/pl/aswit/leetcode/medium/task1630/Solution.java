package pl.aswit.leetcode.medium.task1630;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    //beats 77%
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int length = r[i] - l[i] + 1;
            int[] subarray = new int[length];
            int counter = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                subarray[counter++] = nums[j];
            }
            Arrays.sort(subarray);
            result.add(checkIfArithmetic(subarray));
        }


        return result;
    }

    private boolean checkIfArithmetic(int[] array){
        if(array.length == 1){
            return false;
        }
        if(array.length == 2){
            return true;
        }
        int factor = array[1] - array[0];
        for (int i = 1; i < array.length-1; i++) {
            if(array[i+1] - array[i] != factor){
                return false;
            }
        }
        return true;
    }

}


