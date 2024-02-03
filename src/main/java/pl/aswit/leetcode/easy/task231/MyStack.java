package pl.aswit.leetcode.easy.task231;


import java.util.ArrayDeque;

public class MyStack {

    ArrayDeque<Integer> a;

    public MyStack() {
        a = new ArrayDeque<>();
    }

    public void push(int x) {
        a.addLast(x);
    }

    public int pop() {
        return a.poll();
    }

    public int top() {
        return a.peekLast();
    }

    public boolean empty() {
        return a.isEmpty();
    }
}
