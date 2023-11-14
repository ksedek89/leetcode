package pl.aswit.leetcode.task191;

//hamming weight
//https://en.wikipedia.org/wiki/Hamming_weight
//task 191

/*
unsigned int:

        bits  value
        0000    0
        0001    1
        0010    2
        0011    3
        0100    4
        0101    5
        0110    6
        0111    7
        1000    8
        1001    9
        1010   10
        1011   11
        1100   12
        1101   13
        1110   14
        1111   15

signed int:

        bits  value
        0000    0
        0001    1
        0010    2
        0011    3
        0100    4
        0101    5
        0110    6
        0111    7
        1000   -8
        1001   -7
        1010   -6
        1011   -5
        1100   -4
        1101   -3 to samo co np 11111111111111111111111111111101 najłatwiej wyliczyć jaka to liczba poprzez zmianę wszystkich 1 na 0 i 0 na 1 i na koniec dodać 1 iznak minusa
        1110   -2 np: 101 -> 010 = 2 => 2 + 1 => 3 => -3
        1111   -1*/


import static org.assertj.core.api.Assertions.assertThat;

public class Test {
    public static void main(String [] args){
        var solution = new Solution();
        assertThat(solution.hammingWeight(00000000000000000000000000001011)).isEqualTo(3);
        assertThat(solution.hammingWeight(00000000000000000000000010000000)).isEqualTo(1);
        assertThat(solution.hammingWeight(-3)).isEqualTo(31);
    }

}
