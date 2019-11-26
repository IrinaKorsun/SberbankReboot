package chernoskutov.task_02;

import java.util.Arrays;

public class MyQueue {
    private int sizeInts;
    private int[] ints;
    private int front;
    private int rear;
    private int countElem;

    MyQueue(int sizeInts) {
        this.sizeInts = sizeInts;
        ints = new int[sizeInts];
        front = 0;
        rear = -1;
        countElem = 0;
    }

    public void push(int x) {
        if (rear + 1 == sizeInts) {
            rear = -1;
        }
        ints[++rear] = x;
        countElem++;
    }

    public Integer pop() {
        if (front == sizeInts) {
            front = 0;
        }
        countElem--;
        return ints[front++];
    }

    boolean isFull() {
        return countElem == sizeInts;
    }

    boolean isEmpty() {
        return countElem == 0;
    }

    public int getSizeQueue() {
        return countElem;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "sizeInts=" + sizeInts +
                ", ints=" + Arrays.toString(ints) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
