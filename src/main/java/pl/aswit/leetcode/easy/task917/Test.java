package pl.aswit.leetcode.easy.task917;


import static org.assertj.core.api.Assertions.assertThat;

public class Test {

    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.revert("Test1ng-Leet=code-Q!")).isEqualTo("Qedo1ct-eeLg=ntse-T!");
    }
}
