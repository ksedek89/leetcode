package pl.aswit.leetcode.task2446;

public class Solution {

    //beats 100%
    public boolean haveConflict(String[] event1, String[] event2) {
        if(event1[0].compareTo(event2[0])<0 && event1[1].compareTo(event2[0])<0){
            return false;
        }
        if(event2[0].compareTo(event1[0])<0 && event2[1].compareTo(event1[0])<0){
            return false;
        }
        return true;
    }

}
