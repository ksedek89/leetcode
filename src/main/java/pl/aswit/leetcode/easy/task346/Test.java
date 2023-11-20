package pl.aswit.leetcode.easy.task346;


import org.assertj.core.data.Percentage;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
/*        MovingAverage movingAverage = new MovingAverage(3);
        assertThat(movingAverage.next(1)).isEqualTo(1);
        assertThat(movingAverage.next(10)).isEqualTo(5.5);
        assertThat(movingAverage.next(3)).isCloseTo(4.66667, Percentage.withPercentage(10));
        assertThat(movingAverage.next(5)).isEqualTo(6.0);*/

        MovingAverage movingAverage = new MovingAverage(1);
        assertThat(movingAverage.next(4)).isEqualTo(4);
        assertThat(movingAverage.next(0)).isEqualTo(0);


    }

}
