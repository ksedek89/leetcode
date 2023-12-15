package pl.aswit.leetcode.hard.task4;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4})).isEqualTo(2.5);

    }


}


