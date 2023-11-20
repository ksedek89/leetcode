package pl.aswit.leetcode.medium.task2391;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


//        assertThat(solution.garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2,4,3})).isEqualTo(21);
        assertThat(solution.garbageCollection(new String[]{"MMM","PGM","GP"}, new int[]{3, 10})).isEqualTo(37);

    }

}
