package pl.aswit.leetcode.hard.task4;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        List<Integer> medianIndexList = new ArrayList<>();
        List<Integer> medianList = new ArrayList<>();

        medianIndexList.add((length+1)/2-1);
        if(length%2 == 0){
            medianIndexList.add((length+1)/2);
        }


        int num1Pointer = 0;
        int num2Pointer = 0;


        int counter = 0;
        while (medianList.size() != medianIndexList.size()){
            int currentValue = -1;
            if(num1Pointer >= nums1.length){
                currentValue = nums2[num2Pointer++];
            }else if(num2Pointer >= nums2.length){
                currentValue = nums1[num1Pointer++];
            }else if(nums1[num1Pointer] < nums2[num2Pointer]) {
                currentValue = nums1[num1Pointer++];
            }else{
                currentValue = nums2[num2Pointer++];
            }
            if(counter == medianIndexList.get(0) || (medianIndexList.size() == 2 && counter == medianIndexList.get(1))){
                medianList.add(currentValue);
            }
            counter++;
        }

        return medianList.stream().mapToDouble(e->e).average().getAsDouble();
    }
}

