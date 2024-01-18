package pl.aswit.leetcode.medium.task36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map;
        for (int i = 0; i < board.length; i++) {
            map = new HashMap<>();
            for (int j = 0; j < board[0].length; j++) {
                if(board[j][i] == '.'){
                    continue;
                }
                Integer orDefault = map.getOrDefault(board[j][i], 0);
                if(orDefault > 0){
                    return false;
                }else{
                    map.put(board[j][i],1);
                }

            }

        }

        for (int i = 0; i < board[0].length; i++) {
            map = new HashMap<>();
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == '.'){
                    continue;
                }
                Integer orDefault = map.getOrDefault(board[i][j], 0);
                if(orDefault> 0){
                    return false;
                }else{
                    map.put(board[i][j],1);
                }

            }

        }

        if(!checkSubarray(0,2, 0, 2, board)){
            return false;
        }
        if(!checkSubarray(3,5, 0, 2, board)){
            return false;
        }
        if(!checkSubarray(6,8, 0, 2, board)){
            return false;
        }
        if(!checkSubarray(0,2, 3, 5, board)){
            return false;
        }
        if(!checkSubarray(3,5, 3, 5, board)){
            return false;
        }
        if(!checkSubarray(6,8, 3, 5, board)){
            return false;
        }
        if(!checkSubarray(0,2, 6, 8, board)){
            return false;
        }
        if(!checkSubarray(3,5, 6, 8, board)){
            return false;
        }
        if(!checkSubarray(6,8, 6, 8, board)){
            return false;
        }


        return true;
    }

    private boolean checkSubarray(int x1, int x2, int y1, int y2, char[][] board){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = x1; i <= x2  ; i++) {
            for (int j = y1; j <= y2; j++) {
                if(board[j][i] == '.'){
                    continue;
                }
                Integer orDefault = map.getOrDefault(board[j][i], 0);
                if(orDefault > 0){
                    return false;
                }else{
                    map.put(board[j][i],1);
                }
            }
        }
        return true;
    }



}


