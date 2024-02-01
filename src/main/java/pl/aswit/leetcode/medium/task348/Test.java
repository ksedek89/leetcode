package pl.aswit.leetcode.medium.task348;


import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args) throws IOException {
/*        var solution = new TicTacToe(3);
        solution.move(0,0,1);
        solution.move(0,2,2);
        solution.move(2,2,1);
        solution.move(1,1,2);
        solution.move(2,0,1);
        solution.move(1,0,2);
        int move = solution.move(2, 1, 1);*/
        var solution = new TicTacToe(2);
        solution.move(0,1,1);
        solution.move(1,1,2);
        solution.move(1,0,1);



    }

}
