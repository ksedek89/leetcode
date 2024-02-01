package pl.aswit.leetcode.test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        HashSet a = new HashSet();
        a.add(new TestDto("t"));
        a.add(new TestDto("b"));
        a.add(new TestDto("b"));

        a.remove(new TestDto("fdsjlf"));
        System.out.println();


    }
}
