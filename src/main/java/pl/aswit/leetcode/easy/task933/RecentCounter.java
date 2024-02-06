package pl.aswit.leetcode.easy.task933;


import java.util.PriorityQueue;

public class RecentCounter {

    PriorityQueue<Integer> p;

    public RecentCounter() {
        p = new PriorityQueue<Integer>();
    }

    public int ping(int t) {
        p.add(t);
        while(p.peek() < t-3000){
            p.poll();
        }
        return p.size();
    }
}