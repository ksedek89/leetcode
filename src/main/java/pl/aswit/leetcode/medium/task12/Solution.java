package pl.aswit.leetcode.medium.task12;

import java.util.Arrays;

public class Solution {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int thousandNumber = num / 1000 * 1000;
        if(thousandNumber != 0){
            sb.append(Arrays.stream(mappingE.values()).filter(e->e.getValue() == thousandNumber).map(e->e.toString()).findFirst().get());
        }
        int hundredNumber = (num / 100) % 10 * 100;
        if(hundredNumber!= 0){
            sb.append(Arrays.stream(mappingE.values()).filter(e->e.getValue() == hundredNumber).map(e->e.toString()).findFirst().get());
        }
        int tenNumber = (num / 10) % 10 * 10;
        if(tenNumber!=0){
            sb.append(Arrays.stream(mappingE.values()).filter(e->e.getValue() == tenNumber).map(e->e.toString()).findFirst().get());
        }
        int number = num  % 10;
        if(number != 0){
            sb.append(Arrays.stream(mappingE.values()).filter(e->e.getValue() == number).map(e->e.toString()).findFirst().get());
        }


        return sb.toString();
    }

    private enum mappingE{
        I(1),
        II(2),
        III(3),
        IV(4),
        V(5),
        VI(6),
        VII(7),
        VIII(8),
        IX(9),
        X(10),
        XX(20),
        XXX(30),
        XL(40),
        L(50),
        LX(60),
        LXX(70),
        LXXX(80),
        XC(90),
         C(100),
         CC(200),
         CCC(300),
         CD(400),
         D(500),
         DC(600),
         DCC(700),
         DCCC(800),
         CM(900),
         M(1000),
         MM(2000),
         MMM(3000);

        mappingE(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }

        private long value;
    }

}


