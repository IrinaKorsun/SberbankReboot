package chernoskutov.task_02;

import java.util.Arrays;

public class MyStack {
    private int sizeInts;
    private int[] ints;
    private int top;

    MyStack(int sizeInts) {
        this.sizeInts = sizeInts;
        ints = new int[sizeInts];
        top = -1;
    }

    public void push(int x) {
        ints[++top] = x;
    }

    public int pop() {
        return ints[top--];
    }

    boolean isFull() {
        return top == sizeInts - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }


    @Override
    public String toString() {
        return Arrays.toString(ints);
    }
}
