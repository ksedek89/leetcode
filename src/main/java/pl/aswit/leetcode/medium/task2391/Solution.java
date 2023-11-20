package pl.aswit.leetcode.medium.task2391;

public class Solution {

    //beats 26%
    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0;

        result += countTime('M', garbage, travel);
        result += countTime('P', garbage, travel);
        result += countTime('G', garbage, travel);

        return result;
    }

    private int countTime(char m, String[] house, int[] travel) {
        int result = 0;
        int longestIndex = countFurthestIndex(m, house);
        for(int i = 0; i <=longestIndex; i++){
            if(i < longestIndex){
                result += travel[i];
            }
            result += countGarbageInHouse(m, house[i]);
        }


        return result;
    }

    private int countFurthestIndex(char currentGarbage, String[] garbage) {
        for(int i = garbage.length - 1; i>=0; i--){
            if(garbage[i].contains(Character.toString(currentGarbage))){
                return i;
            }
        }
        return -1;
    }

    private int countGarbageInHouse(char g, String house){
        int count = 0;
        for(char a: house.toCharArray()){
            if(a == g){
                count++;
            }
        }
        return count;
    }

}


