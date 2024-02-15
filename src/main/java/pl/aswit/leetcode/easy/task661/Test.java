package pl.aswit.leetcode.easy.task661;


import pl.aswit.leetcode.test.TestDto;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();

        TreeSet a = new TreeSet();
        a.add(new TestDto("c"));
        a.add(new TestDto("b"));
        a.add(new TestDto("a"));


        assertThat(solution.imageSmoother(new int[][]{{100,200,100},{200,50,200}, {100,200,100}})).isEqualTo(0);

    }
}
