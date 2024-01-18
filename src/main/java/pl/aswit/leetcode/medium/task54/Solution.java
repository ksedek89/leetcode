package pl.aswit.leetcode.medium.task54;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList();
        int completedRowTop = 0;
        int completedRowDown= matrix.length-1;
        int completedColumnLeft= 0;
        int completedColumnRight= matrix[0].length-1;

        StateE currentState = StateE.RIGHT;
        int currentRow = 0;
        int currentColumn = 0;




        int counter = 0;
        while(counter!= (matrix.length * matrix[0].length)){
            result.add(matrix[currentRow][currentColumn]);
            if(currentState.equals(StateE.RIGHT)){
                if(currentColumn == completedColumnRight){
                    currentState = StateE.DOWN;
                    currentRow++;
                    completedRowTop++;
                }else{
                    currentColumn++;
                }
            }else if(currentState.equals(StateE.DOWN)){
                if(currentRow == completedRowDown){
                    currentState = StateE.LEFT;
                    currentColumn--;
                    completedColumnRight--;
                }else{
                    currentRow++;
                }
            }else if(currentState.equals(StateE.LEFT)){
                if(currentColumn == completedColumnLeft){
                    currentState = StateE.UP;
                    currentRow--;
                    completedRowDown--;

                }else{
                    currentColumn--;
                }
            }else if(currentState.equals(StateE.UP)){
                if(currentRow == completedRowTop){
                    currentState = StateE.RIGHT;
                    currentColumn++;
                    completedColumnLeft++;

                }else{
                    currentRow--;
                }
            }
            counter++;
        }
        return result;
    }







    enum StateE{
        UP("RIGHT"),
        RIGHT("DOWN"),
        DOWN("LEFT"),
        LEFT("UP");


        StateE(String nextState) {
            this.nextState = nextState;
        }

        private String nextState;

        public StateE getNextState() {
            return StateE.valueOf(nextState);
        }
    }
}


