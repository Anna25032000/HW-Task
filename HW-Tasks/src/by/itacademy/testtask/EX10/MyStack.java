package by.itacademy.testtask.EX10;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack implements Stackable <Integer> {
    private final Deque<Integer> queue = new LinkedList<>();
    private int maxNumber;


    @Override
    public void push(Integer o) {
        if(o > maxNumber) {
            maxNumber = o;
        }
        queue.push(o);
    }

    @Override
    public Integer pop() {
        int lastElement = queue.pop();
        maxNumber = 0;
        for (int i : queue){
            maxNumber = Math.max(maxNumber, i);
        }
        return lastElement;
    }

    @Override
    public Integer max() {
        return maxNumber;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "queue=" + queue +
                '}';
    }
}


