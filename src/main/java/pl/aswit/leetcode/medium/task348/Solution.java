package pl.aswit.leetcode.medium.task348;

import java.util.Arrays;

class TicTacToe {

    int[][] tab;

    public TicTacToe(int n) {
        tab = new int[n][n];
    }

    public int move(int row, int col, int player) {
        tab[row][col] = player;
        int i = calculateWinner(row, col, player);
        System.out.println(i);
        return i;
    }

    private int calculateWinner(int row, int col, int player) {
        //row
        for (int i = 0; i < tab.length; i++) {
            if(tab[i][col] != player){
                break;
            }
            if(i == tab.length-1){
                return player;
            }
        }
        //column
        for (int i = 0; i < tab.length; i++) {
            if(tab[row][i] != player){
                break;
            }
            if(i == tab.length-1){
                return player;
            }
        }
        //diag1
        for (int i = 0; i < tab.length; i++) {
            if(tab[i][i] != player){
                break;
            }
            if(i == tab.length-1){
                return player;
            }
        }
        //diag2
        for (int i = 0; i < tab.length; i++) {
            if(tab[i][tab.length-1-i] != player){
                break;
            }
            if(i == tab.length-1){
                return player;
            }
        }
        return 0;
    }
}


