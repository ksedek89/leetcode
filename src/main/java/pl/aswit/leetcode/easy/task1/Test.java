package pl.aswit.leetcode.easy.task1;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();


        assertThat(solution.twoSum(new int[]{2,7,11,15}, 9)).isEqualTo(new int[]{0,1});

    }


}


