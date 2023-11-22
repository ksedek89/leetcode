package pl.aswit.leetcode.medium.task1424;


import java.util.*;

public class Solution {

    //beats 73%
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int size = 0;
        for(int i = nums.size()-1; i>=0; i--){
            List<Integer> currentList = nums.get(i);
            for(int j = 0; j < currentList.size(); j++){
                int sum = j+i;
                List<Integer> orDefault = map.getOrDefault(sum, new ArrayList<>());
                orDefault.add(currentList.get(j));
                map.put(sum, orDefault);
                size++;
            }
        }
        int[] ans = new int[size];
        int counter = 0;
        int i = 0;
        while (counter != size){
            List<Integer> integers = map.get(i);
            for(int a: integers){
                ans[counter] = a;
                counter++;
            }
            i++;
        }
        return ans;
    }

   public int[] findDiagonalOrderTimeExceeded(List<List<Integer>> nums) {
       int[] currentIndexes = new int[nums.size()];
       List<Integer> output = new ArrayList<>();
       int size = 0;

       for(List<Integer> list : nums){
           size += list.size();
       }

       int i = 0;
       while (size != output.size()){
            for(int j = i; j >=0; j--){
                if(j >= nums.size()){
                    continue;
                }
                List<Integer> currentList = nums.get(j);
                int currentIndex = currentIndexes[j];
                if(currentIndex < currentList.size()){
                    output.add(currentList.get(currentIndex));
                    currentIndexes[j] = currentIndex + 1;
                }
            }
            i++;
        }

        int[] outputArray = new int[output.size()];
        for(int k = 0; k< output.size(); k++){
            outputArray[k] = output.get(k);
        }
        return outputArray;
    }

}


