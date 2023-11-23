package pl.aswit.leetcode.easy.task345;


import pl.aswit.leetcode.utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){

        Solution solution = new Solution();


        assertThat(solution.reverseVowels("hello")).isEqualTo("holle");
        assertThat(solution.reverseVowels("leetcode")).isEqualTo("leotcede");

    }

}
