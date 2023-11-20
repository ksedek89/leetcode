package pl.aswit.leetcode.easy.task346;


import java.util.LinkedList;
import java.util.Queue;

//beats 5%
public class MovingAverage {

    Queue<Integer> queue;
    int size;

    public MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList();
    }

    public double next(int val) {
        if(queue.size() < size){
            queue.add(val);
        }else{
            queue.poll();
            queue.add(val);
        }
        int sum = 0;
        int count = 0;
        for (int num : queue) {
            sum += num;
            count++;
        }
        return (double) sum / count;
    }
}