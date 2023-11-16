package pl.aswit.leetcode.easy.task118;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    //beats 91%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList();
        outerList.add(List.of(1));
        int counter = 2;
        for (int i = 1; i< numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j = 0; j < counter; j++){
                if(j == 0 || j == counter-1){
                    innerList.add(1);
                }else{
                    innerList.add(outerList.get(i - 1).get(j-1) + outerList.get(i - 1).get(j));
                }
            }
            counter++;
            outerList.add(innerList);
        }
        return outerList;
    }

}
