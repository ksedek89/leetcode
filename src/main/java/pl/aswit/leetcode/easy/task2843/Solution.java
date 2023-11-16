package pl.aswit.leetcode.easy.task2843;

public class Solution {

    //beats 94
    public int countSymmetricIntegers(int low, int high) {
        int counter = 0;
        for(int i = low; i<=high; i++){
            if(isSymmetric90(i)){
                counter++;
            }
        }
        return counter;
    }

    private boolean isSymmetric(int i) {
        // 1 digit || 3 digits
        if(i / 10 == 0 || (i / 100 != 0 && i / 1000 == 0)){
            return false;
        }
        //4 digits
        if(i/1000 > 0) {
            return i / 1000 + i / 100 % 10 == i / 10 % 10 + i % 10;
        }else{
        //2 digits
            return i/10 == i%10;
        }
    }

    //beats 90
    private boolean isSymmetric90(int i) {
        String value = String.valueOf(i);
        if(value.length() % 2  == 1){
            return false;
        }
        if(value.length() == 2){
            return value.charAt(0) == value.charAt(1);
        }
        if((int)value.charAt(0) + (int)value.charAt(1) == (int)value.charAt(2) + (int)value.charAt(3)){
            return true;
        }
        return false;
    }

}
