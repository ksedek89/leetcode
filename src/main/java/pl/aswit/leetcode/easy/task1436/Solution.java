package pl.aswit.leetcode.easy.task1436;

import java.util.HashMap;
import java.util.List;

public class Solution {

    public String destCity(List<List<String>> paths) {
        for (int i = 0; i < paths.size(); i++) {
            String destCity = paths.get(i).get(1);
            if(paths.stream().noneMatch(e->e.get(0).equals(destCity))){
                return destCity;
            }
        }
        return null;
    }


}
