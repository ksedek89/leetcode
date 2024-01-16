package pl.aswit.leetcode.medium.task380;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomizedSet {
    private Set set;

    public RandomizedSet() {
        set = new TreeSet();
    }

    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }else{
            set.add(val);
        }
        return true;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Iterator iterator = set.iterator();
        int size = set.size();
        int indexToDelete = new Random().nextInt(size);
        int i = 0;
        while (iterator.hasNext()){
            Integer next = (Integer) iterator.next();
            if(indexToDelete == i++){
                return next;
            }
        }

        return -1;
    }
}


