package pl.aswit.leetcode.easy.task1287;


public class Solution {

    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int result = -1;
        int length = arr.length;
        int lastValue = -1;
        int lastCount = -1;
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            if(currentValue == lastValue){
                if(++lastCount > 0.25*length){
                    result = currentValue;
                    break;
                }
            }else{
                lastValue = currentValue;
                lastCount = 1;
            }

        }
        return result;
    }

}
