package pl.aswit.leetcode.easy.task1436;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.destCity(List.of(List.of("London","New York"),List.of("New York","Lima"),List.of("Lima","Sao Paulo")))).isEqualTo("Sao Paulo");

    }

}
